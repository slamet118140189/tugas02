package com.example.tugas02.ui.skill

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugas02.databinding.FragmentSkillBinding
import com.example.tugas02.ui.SkillAdapter

data class SkillItem(
    val name: String,
    val description: String
)

class SkillFragment : Fragment() {

    private var _binding: FragmentSkillBinding? = null
    private val binding get() = _binding!!

    private val skillItems = listOf(
        SkillItem("Python", "Bahasa pemrograman serbaguna dengan sintaksis yang mudah dibaca dan kuat."),
        SkillItem("JavaScript", "Bahasa pemrograman berorientasi objek untuk pengembangan web dan aplikasi berbasis browser"),
        SkillItem("Java", "Bahasa pemrograman yang kuat dan umum digunakan untuk pengembangan aplikasi berbasis Android"),
        SkillItem("C++", "Bahasa pemrograman yang efisien dan digunakan dalam pengembangan perangkat lunak, game, dan sistem"),
        SkillItem("C#", "Bahasa pemrograman yang kuat dan digunakan untuk pengembangan aplikasi berbasis Windows dan game"),
        SkillItem("Ruby", "Bahasa pemrograman dinamis yang mudah dipahami, sering digunakan untuk pengembangan web"),
        SkillItem("Swift", "Bahasa pemrograman eksklusif Apple untuk pengembangan aplikasi iOS, macOS, watchOS, dan tvOS"),
        SkillItem("PHP", "Bahasa pemrograman server-side untuk pengembangan web dinamis"),
        SkillItem("Rust", "Bahasa pemrograman dengan fokus pada keamanan dan kinerja tinggi, sering digunakan dalam sistem"),
        SkillItem("Golang", "Bahasa pemrograman yang dirancang oleh Google dengan fokus pada efisiensi dan pengembangan perangkat lunak berskala besar"),
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSkillBinding.inflate(inflater, container, false)
        val rootView = binding.root

        // Inisialisasi RecyclerView dan adapter
        val recyclerView = binding.recyclerView
        val adapter = SkillAdapter(skillItems)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        return rootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
