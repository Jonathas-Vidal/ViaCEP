package com.example.viacep.presenter.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.viacep.R
import com.example.viacep.databinding.FragmentSearchAddressBinding
import com.example.viacep.databinding.ItemAddressBinding
import com.example.viacep.domain.model.Adress
import com.example.viacep.util.Constants
import com.example.viacep.util.Constants.ADDRESS_BUNDLE_KEY
import com.example.viacep.util.Constants.REQUEST_KEY
import com.example.viacep.util.StateView
import com.example.viacep.util.getParcelableCompat
import com.example.viacep.util.hideKeyboard
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchAddressFragment : Fragment() {
    private val viewModel: SearchViewModel by viewModels()

    private var _binding: FragmentSearchAddressBinding? = null
    private val binding get() = _binding!!
    private var address: Adress? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchAddressBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()
    }

    private fun initListeners() {
        binding.editCep.addTextChangedListener {
            val text = it?.toString() ?: ""
            if (text.isNotEmpty()) {
                if (text.length == 8) {
                    hideKeyboard()
                    getAdress(cep = text)
                }
            }
        }

        binding.btnSave.setOnClickListener {
            if (address != null) {
                parentFragmentManager.setFragmentResult(
                    REQUEST_KEY,
                    bundleOf(Pair(ADDRESS_BUNDLE_KEY, address))
                )
            }
            findNavController().popBackStack()
        }
    }

    private fun getAdress(cep: String) {

        viewModel.getAdress(cep).observe(viewLifecycleOwner) { stateView ->
            when (stateView) {
                is StateView.Loading -> {
                    binding.btnSave.isEnabled = false
                    binding.itemAddress.viewFlipper.displayedChild = 2
                }

                is StateView.Success -> {
                    if (stateView.data?.cep != null) {
                        address = stateView.data

                        binding.btnSave.isEnabled = true
                        binding.itemAddress.viewFlipper.displayedChild = 1
                        binding.itemAddress.textAddress.text = stateView.data.getFullAdress()
                    } else {
                        stateError()
                    }
                }

                is StateView.Error -> {
                    stateError()
                }
            }
        }
    }

    private fun stateError() {
        address = null
        binding.btnSave.isEnabled = false
        binding.itemAddress.viewFlipper.displayedChild = 0
        binding.itemAddress.textEmptyAddress.text =
            getString(R.string.label_address_empty_search_address_fragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}