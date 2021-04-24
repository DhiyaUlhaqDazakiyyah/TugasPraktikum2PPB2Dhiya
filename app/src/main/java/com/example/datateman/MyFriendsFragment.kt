package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Dhiya Ulhaq Dazakiyyah", "Laki-Laki", "dazakiyyah@gmail.com",
        "087766621855", "Malang"))
        listTeman.add(MyFriend("Nova Eka Permadi", "Laki-Laki", "nova@gmail.com",
        "081234567890", "Malang"))
        listTeman.add(MyFriend("Oky Mikhael", "Laki-Laki", "oky@gmail.com", "088654234543", "Malang"))
        listTeman.add(MyFriend("Daud Ridho Ilahi", "Laki-Laki", "daud@gmail.com", "085632124432", "Malang"))
        listTeman.add(MyFriend("Indra Oki Sandy", "Laki-Laki", "indra@gmail.com", "089667536142", "Malang"))
        listTeman.add(MyFriend("Ahmad Rifki Abdillah","Laki-Laki", "ahmad@gmail.com", "081342432976", "Malang"))
        listTeman.add(MyFriend("Widya Retnaning Pratiwi", "Perempuan","widya@gmail.com", "088124512843", "Malang"))
    }

    private fun tampilTeman(){
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(activity!!,listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}