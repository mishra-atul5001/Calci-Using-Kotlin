package com.example.atulmishra.calci

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun butclicknum(view:View){
      //  val data=editText.text
        if(isnewop){
            editText.setText("")
        }
        isnewop=false
        val bclickid=view as Button
        var clickvalue:String=editText.text.toString()       //directly get data to edittext and from edit text
        when(bclickid.id){
            bzero.id->{
                clickvalue+="0"
            }
            but1.id->{
                clickvalue+="1"
            }
            but2.id->{
                clickvalue+="2"
            }
            but3.id->{
                clickvalue+="3"
            }
            but4.id->{
                clickvalue+="4"
            }
            but5.id->{
                clickvalue+="5"
            }
            but6.id->{
                clickvalue+="6"
            }
            but7.id->{
                clickvalue+="7"
            }
            but8.id->{
                clickvalue+="8"
            }
            but9.id->{
                clickvalue+="9"
            }
           /* badd.id->{
                clickvalue="1"
            }
           bsub.id->{
                clickvalue="1"
            }*/
            bdot.id->{
                clickvalue+="."
            }
            bplusminus.id->{
                clickvalue="-" + clickvalue
            }
        }
        editText.setText(clickvalue)
    }

    var operation="+"
    var old=""
    var isnewop=true

    fun butclickop(view: View){
        val buclick=view as Button
        when(buclick.id){
            badd.id->{
                operation="+"

            }
            bsub.id->{
                operation="-"
            }
            bmult.id->{
                operation="*"
            }
            bdiv.id->{
                operation="/"
            }

        }
        old=editText.text.toString()
        isnewop=true
    }

fun btequals(view: View){
    val newnumber=editText.text.toString()
    var total:Double?=null
    when(operation){
        "+"->{

            total=old.toDouble()+newnumber.toDouble()
        }
        "-"->{
            total=old.toDouble()-newnumber.toDouble()
        }
        "*"->{
            total=old.toDouble()*newnumber.toDouble()
        }
        "/"->{
            total=old.toDouble()/newnumber.toDouble()
        }
    }
    editText.setText(total.toString())
    isnewop=true
}
fun butclickpercent(view: View){
    val percentnumber:Double=editText.text.toString().toDouble()/100
    editText.setText(percentnumber.toString())
    isnewop=true
}
    fun butclean(view: View){
        editText.setText("0")
        isnewop=true
    }

}


