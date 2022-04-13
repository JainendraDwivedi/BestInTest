package com.example.quizapp

object setData {
const val name:String="name"
    const val Score:String="Score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "What is the capital of India?",
           "Mumbai",
           "Kolkata",
           "New Delhi",
           "Lucknow",
           3
       )

       var question2 = QuestionData(
           2,
           "Who was the First Home Minister of India?",
           "Abul Kalam Azad",
           "Pt. Jawaharlal Nehru",
           "Sardar Vallabh Bhai Patel",
           "G.V. Mavalnkar",
           3
       )

       var question3 = QuestionData(
           3,
           "Which one is odd?",
           "Uranus",
           "Pluto",
           "Neptune",
           "Mars",
           2
       )
       var question4 = QuestionData(
           4,
           "Who was the first Indian Woman in Space?",
           "Kalpana Chawla",
           "Sunita Williams",
           "Koneru Humpy",
           "NOTA",
           1
       )
       var question5 = QuestionData(
           5,
           "Which is the tallest mountain of India",
           "Mt. Everest",
           "Kanchenjunga",
           "Mount K2",
           "NOTA",
           3
       )
       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}