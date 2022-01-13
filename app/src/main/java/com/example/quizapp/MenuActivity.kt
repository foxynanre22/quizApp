package com.example.quizapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.quiz_ticket.view.*

class MenuActivity : AppCompatActivity() {
    var adapter : QuizAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        adapter = QuizAdapter(this, Constans.listOfQuiz)
        gvListQuiz.adapter = adapter
    }

    class QuizAdapter : BaseAdapter {
        var listOfQuiz = ArrayList<Quiz>()
        var context : Context? = null

        constructor(context: Context, listOfQuiz: ArrayList<Quiz>):super(){
            this.context = context
            this.listOfQuiz = listOfQuiz
        }

        override fun getCount(): Int {
            return listOfQuiz.size
        }

        override fun getItem(position: Int): Any {
            return listOfQuiz[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val quiz = listOfQuiz[position]
            var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var quizView = inflator.inflate(R.layout.quiz_ticket, null)
            quizView.IvQuizImage.setImageResource(quiz.image!!)
            quizView.IvQuizImage.setOnClickListener{
                val intent = Intent(context, QuizQuestionsActivity::class.java)
                intent.putExtra("quizName", quiz.name!!)
                context!!.startActivity(intent)
            }
            quizView.tvName.text = quiz.name!!
            return  quizView
        }

    }
}