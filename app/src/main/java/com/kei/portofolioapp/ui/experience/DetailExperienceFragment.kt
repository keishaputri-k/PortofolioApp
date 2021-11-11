package com.kei.portofolioapp.ui.experience

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import coil.load
import com.kei.portofolioapp.databinding.FragmentDetailExperiencesBinding

class DetailExperienceFragment : Fragment() {
    private var _binding: FragmentDetailExperiencesBinding? = null
    private val binding get() = _binding!!
    private val experienceArgs by navArgs<DetailExperiencesFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailExperiencesBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            tvTitleName.text = experienceArgs.experience.title
            tvContentDetailExperiences.text = experienceArgs.experience.detail
            ivDetailProfile.load(experienceArgs.experience.image){
                crossfade(2000)
            }
        }
    }

}