package com.example.quizapp

object Constans {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    var listOfQuiz = ArrayList<Quiz>()

    fun getFlagsQuestions() : ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1, "What country does this flag belong to?",
            R.drawable.flag_france, "France", "Jamaica", "USA",
            "Israel", 1)
        questionsList.add(que1)

        val que2 = Question(2, "What country does this flag belong to?",
            R.drawable.flag_germany, "France", "Germany", "Ukraine",
            "Argentina", 2)
        questionsList.add(que2)

        val que3 = Question(3, "What country does this flag belong to?",
            R.drawable.flag_ukraine, "Russia", "Poland", "Lithuania",
            "Ukraine", 4)
        questionsList.add(que3)

        val que4 = Question(4, "What country does this flag belong to?",
            R.drawable.flag_poland, "France", "Poland", "Belarus",
            "Norway", 2)
        questionsList.add(que4)

        val que5 = Question(5, "What country does this flag belong to?",
            R.drawable.flag_russia, "Spain", "Jamaica", "Russia",
            "United Kingdom", 3)
        questionsList.add(que5)

        val que6 = Question(6, "What country does this flag belong to?",
            R.drawable.flag_uk, "United Kingdom", "Japan", "USA",
            "Cyprus", 1)
        questionsList.add(que6)

        val que7 = Question(7, "What country does this flag belong to?",
            R.drawable.flag_japan, "Ukraine", "Poland", "Japan",
            "Israel", 3)
        questionsList.add(que7)

        val que8 = Question(8, "What country does this flag belong to?",
            R.drawable.flag_usa, "USA", "Jamaica", "Portugal",
            "Israel", 1)
        questionsList.add(que8)

        return questionsList
    }

    fun getCarsQuestions() : ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1, "What company does this logo belong to?",
            R.drawable.mercedes, "BWM", "Mercedes", "Toyota",
            "Israel", 2)
        questionsList.add(que1)

        val que2 = Question(2, "What company does this logo belong to?",
            R.drawable.bmw, "Ferrari", "Ford", "Mercedes",
            "BMW", 4)
        questionsList.add(que2)

        val que3 = Question(3, "What company does this logo belong to?",
            R.drawable.ford, "Reno", "Shkoda", "Ford",
            "Volkswagen", 3)
        questionsList.add(que3)

        val que4 = Question(4, "What company does this logo belong to?",
            R.drawable.volkswagen, "Nissan", "Volkswagen", "Honda",
            "KIA", 2)
        questionsList.add(que4)

        return questionsList
    }

    fun initialListOfQuiz() : Void? {
        listOfQuiz.add(Quiz("Cars", R.drawable.mercedes))
        listOfQuiz.add(Quiz("Flags", R.drawable.flag_usa))

        return null
    }
}