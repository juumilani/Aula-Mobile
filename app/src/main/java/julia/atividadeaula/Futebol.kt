package julia.atividadeaula

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_pebolim.*

class Futebol : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_futebol)

        val text1 = findViewById(R.id.text1) as TextView
        val text2 = findViewById(R.id.text2) as TextView

        var score1 = 0
        var score2 = 0

        text1.setOnClickListener(){

            text1.setBackgroundColor(Color.parseColor("#E0E0E0"))
            text2.setBackgroundColor(Color.parseColor("#FAFAFA"))

            btnSoma.setOnClickListener(){
                score1++
                text1.text = score1.toString()

            }

            btnSubtrai.setOnClickListener(){

                if (score1 > 0){
                    score1--;
                    text1.text = score1.toString()
                }
            }


        }


        text2.setOnClickListener() {

            text2.setBackgroundColor(Color.parseColor("#E0E0E0"))
            text1.setBackgroundColor(Color.parseColor("#FAFAFA"))

            btnSoma.setOnClickListener(){
                score2++
                text2.text = score2.toString()

            }

            btnSubtrai.setOnClickListener(){

                if(score2 > 0){
                    score2--;
                    text2.text = score2.toString()
                }

            }
        }
    }
}
