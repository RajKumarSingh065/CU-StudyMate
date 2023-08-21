package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val parentList = ArrayList<ParentItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.parentRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addDataToList()
        val adapter = ParentAdapter(parentList)
        recyclerView.adapter = adapter
    }

    private fun addDataToList() {

        val childItems1 = ArrayList<ChildItem>()
        childItems1.add(ChildItem("Mathematics", R.drawable.maths))
        childItems1.add(ChildItem("Physics", R.drawable.physics))
        childItems1.add(ChildItem("BEEE", R.drawable.beee))
        childItems1.add(ChildItem("OOPS", R.drawable.cpp))
        childItems1.add(ChildItem("Disruptive Technologies", R.drawable.dt))
        childItems1.add(ChildItem("CG CAD", R.drawable.cgcad))
        childItems1.add(ChildItem("ITPS", R.drawable.c))
        childItems1.add(ChildItem("Digital Electronics", R.drawable.de))
        childItems1.add(ChildItem("Communication Skills", R.drawable.comskills))
        childItems1.add(ChildItem("Biology", R.drawable.biology))


        parentList.add(ParentItem("Engineering", R.drawable.engineering, childItems1))

        val childItem2 = ArrayList<ChildItem>()
        childItem2.add(ChildItem("Financial Accounting", R.drawable.fa))
        childItem2.add(ChildItem("English Language", R.drawable.eng))
        childItem2.add(ChildItem("Business Law", R.drawable.busslaw))
        parentList.add(
            ParentItem(
                "Bachelors of Commerce",
                R.drawable.bcom,
                childItem2
            )
        )
        val childItem3 = ArrayList<ChildItem>()
        childItem3.add(ChildItem("Communication Skills", R.drawable.comskills))
        childItem3.add(ChildItem("Computational Mathematics", R.drawable.maths))
        childItem3.add(ChildItem("Digital Logic", R.drawable.dl))
        parentList.add(
            ParentItem(
                "Master of Engineering",
                R.drawable.engineering,
                childItem3
            )
        )

    }

}