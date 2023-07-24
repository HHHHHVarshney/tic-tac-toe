package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.tictactoe.databinding.ActivityMainBinding
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var activePlayer = 0
    var listGame = intArrayOf(2,2,2,2,2,2,2,2,2).toCollection(ArrayList())
    var hitted = intArrayOf(0,0,0,0,0,0,0,0,0).toCollection(ArrayList())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.IV1.setOnClickListener {
            if(activePlayer == 0 && hitted[0] == 0){
                binding.IV1.setImageResource(R.drawable.oo)
                listGame[0] = 0
                hitted[0] = 1
                activePlayer = 1
                binding.turn.text = getString(R.string.x_turn)
            }
            else if (activePlayer == 1 && hitted[0] == 0){
                binding.IV1.setImageResource(R.drawable.cross)
                listGame[0] = 1
                hitted[0] = 1
                activePlayer = 0
                binding.turn.text = getString(R.string.o_turn)
            }
            checkIfComplete()
        }
        binding.IV2.setOnClickListener {
            if(activePlayer == 0 && hitted[1] == 0){
                binding.IV2.setImageResource(R.drawable.oo)
                listGame[1] = 0
                hitted[1] = 1
                activePlayer = 1
                binding.turn.text = getString(R.string.x_turn)
            }
            else if (activePlayer == 1 && hitted[1] == 0){
                binding.IV2.setImageResource(R.drawable.cross)
                listGame[1] = 1
                hitted[1] = 1
                activePlayer = 0
                binding.turn.text = getString(R.string.o_turn)
            }
            checkIfComplete()
        }
        binding.IV3.setOnClickListener {
            if(activePlayer == 0 && hitted[2] == 0){
                binding.IV3.setImageResource(R.drawable.oo)
                listGame[2] = 0
                hitted[2] = 1
                activePlayer = 1
                binding.turn.text = getString(R.string.x_turn)
            }
            else if (activePlayer == 1 && hitted[2] == 0){
                binding.IV3.setImageResource(R.drawable.cross)
                listGame[2] = 1
                hitted[2] = 1
                activePlayer = 0
                binding.turn.text = getString(R.string.o_turn)
            }
            checkIfComplete()
        }
        binding.IV4.setOnClickListener {
            if(activePlayer == 0 && hitted[3] == 0){
                binding.IV4.setImageResource(R.drawable.oo)
                listGame[3] = 0
                hitted[3] = 1
                activePlayer = 1
                binding.turn.text = getString(R.string.x_turn)
            }
            else if (activePlayer == 1 && hitted[3] == 0){
                binding.IV4.setImageResource(R.drawable.cross)
                listGame[3] = 1
                hitted[3] = 1
                activePlayer = 0
                binding.turn.text = getString(R.string.o_turn)
            }
            checkIfComplete()
        }
        binding.IV5.setOnClickListener {
            if(activePlayer == 0 && hitted[4] == 0){
                binding.IV5.setImageResource(R.drawable.oo)
                listGame[4] = 0
                hitted[4] = 1
                activePlayer = 1
                binding.turn.text = getString(R.string.x_turn)
            }
            else if (activePlayer == 1 && hitted[4] == 0){
                binding.IV5.setImageResource(R.drawable.cross)
                listGame[4] = 1
                activePlayer = 0
                hitted[4] = 1
                binding.turn.text = getString(R.string.o_turn)
            }
            checkIfComplete()
        }
        binding.IV6.setOnClickListener {
            if(activePlayer == 0 && hitted[5] == 0){
                binding.IV6.setImageResource(R.drawable.oo)
                listGame[5] = 0
                hitted[5] = 1
                activePlayer = 1
                binding.turn.text = getString(R.string.x_turn)
            }
            else if (activePlayer == 1 && hitted[5] == 0){
                binding.IV6.setImageResource(R.drawable.cross)
                listGame[5] = 1
                hitted[5] = 1
                activePlayer = 0
                binding.turn.text = getString(R.string.o_turn)
            }
            checkIfComplete()
        }
        binding.IV7.setOnClickListener {
            if(activePlayer == 0 && hitted[6] == 0){
                binding.IV7.setImageResource(R.drawable.oo)
                listGame[6] = 0
                hitted[6] = 1
                activePlayer = 1
                binding.turn.text = getString(R.string.x_turn)
            }
            else if (activePlayer == 1 && hitted[6] == 0){
                binding.IV7.setImageResource(R.drawable.cross)
                listGame[6] = 1
                hitted[6] = 1
                activePlayer = 0
                binding.turn.text = getString(R.string.o_turn)
            }
            checkIfComplete()
        }
        binding.IV8.setOnClickListener {
            if(activePlayer == 0 && hitted[7] == 0){
                binding.IV8.setImageResource(R.drawable.oo)
                listGame[7] = 0
                hitted[7] = 1
                activePlayer = 1
                binding.turn.text = getString(R.string.x_turn)
            }
            else if (activePlayer == 1 && hitted[7] == 0){
                binding.IV8.setImageResource(R.drawable.cross)
                listGame[7] = 1
                hitted[7] = 1
                activePlayer = 0
                binding.turn.text = getString(R.string.o_turn)
            }
            checkIfComplete()
        }
        binding.IV9.setOnClickListener {
            if(activePlayer == 0 && hitted[8] == 0){
                binding.IV9.setImageResource(R.drawable.oo)
                listGame[8] = 0
                hitted[8] = 1
                activePlayer = 1
                binding.turn.text = getString(R.string.x_turn)
            }
            else if (activePlayer == 1 && hitted[8] == 0){
                binding.IV9.setImageResource(R.drawable.cross)
                listGame[8] = 1
                hitted[8] = 1
                activePlayer = 0
                binding.turn.text = getString(R.string.o_turn)
            }
            checkIfComplete()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
    private fun checkIfComplete() {
        if((listGame[0] == 0 && listGame[1] == 0 && listGame[2] == 0) ||
            (listGame[3] == 0 && listGame[4] == 0 && listGame[5] == 0) ||
            (listGame[6] == 0 && listGame[7] == 0 && listGame[8] == 0) ||
            (listGame[0] == 0 && listGame[3] == 0 && listGame[6] == 0) ||
            (listGame[1] == 0 && listGame[4] == 0 && listGame[7] == 0) ||
            (listGame[2] == 0 && listGame[5] == 0 && listGame[8] == 0) ||
            (listGame[0] == 0 && listGame[4] == 0 && listGame[8] == 0) ||
            (listGame[2] == 0 && listGame[4] == 0 && listGame[6] == 0)){
                val builder = AlertDialog.Builder(this)
                builder.setMessage("Do you want to play Again ?")
                builder.setTitle("Player O Won\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89")
                builder.setCancelable(false)
                builder.setPositiveButton("Yes") {
                        dialog, which -> dialog.cancel()
                        binding.IV1.setImageResource(0)
                        binding.IV2.setImageResource(0)
                        binding.IV3.setImageResource(0)
                        binding.IV4.setImageResource(0)
                        binding.IV5.setImageResource(0)
                        binding.IV6.setImageResource(0)
                        binding.IV7.setImageResource(0)
                        binding.IV8.setImageResource(0)
                        binding.IV9.setImageResource(0)
                    listGame[0] = 2
                    listGame[1] = 2
                    listGame[2] = 2
                    listGame[3] = 2
                    listGame[4] = 2
                    listGame[5] = 2
                    listGame[6] = 2
                    listGame[7] = 2
                    listGame[8] = 2
                    hitted[0] = 0
                    hitted[1] = 0
                    hitted[2] = 0
                    hitted[3] = 0
                    hitted[4] = 0
                    hitted[5] = 0
                    hitted[6] = 0
                    hitted[7] = 0
                    hitted[8] = 0
                }
                builder.setNegativeButton("No") {
                        dialog, which -> finish()
                }
                val alertDialog = builder.create()
                alertDialog.show()
        }
        else if((listGame[0] == 1 && listGame[1] == 1 && listGame[2] == 1) ||
            (listGame[3] == 1 && listGame[4] == 1 && listGame[5] == 1) ||
            (listGame[6] == 1 && listGame[7] == 1 && listGame[8] == 1) ||
            (listGame[0] == 1 && listGame[3] == 1 && listGame[6] == 1) ||
            (listGame[1] == 1 && listGame[4] == 1 && listGame[7] == 1) ||
            (listGame[2] == 1 && listGame[5] == 1 && listGame[8] == 1) ||
            (listGame[0] == 1 && listGame[4] == 1 && listGame[8] == 1) ||
            (listGame[2] == 1 && listGame[4] == 1 && listGame[6] == 1)){
            val builder = AlertDialog.Builder(this)
            builder.setMessage("Do you want to play Again ?")
            builder.setTitle("Player X Won\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89")
            builder.setCancelable(false)
            builder.setPositiveButton("Yes") {
                    dialog, which -> dialog.cancel()
                binding.IV1.setImageResource(0)
                binding.IV2.setImageResource(0)
                binding.IV3.setImageResource(0)
                binding.IV4.setImageResource(0)
                binding.IV5.setImageResource(0)
                binding.IV6.setImageResource(0)
                binding.IV7.setImageResource(0)
                binding.IV8.setImageResource(0)
                binding.IV9.setImageResource(0)
                listGame[0] = 2
                listGame[1] = 2
                listGame[2] = 2
                listGame[3] = 2
                listGame[4] = 2
                listGame[5] = 2
                listGame[6] = 2
                listGame[7] = 2
                listGame[8] = 2
                hitted[0] = 0
                hitted[1] = 0
                hitted[2] = 0
                hitted[3] = 0
                hitted[4] = 0
                hitted[5] = 0
                hitted[6] = 0
                hitted[7] = 0
                hitted[8] = 0
            }
            builder.setNegativeButton("No") {
                    dialog, which -> finish()
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }
        else if(listGame[0] != 2 && listGame[1] != 2 && listGame[2] != 2 &&
            listGame[3] != 2 && listGame[4] != 2 && listGame[5] != 2 &&
            listGame[6] != 2 && listGame[7] != 2 && listGame[8] != 2){
            val builder = AlertDialog.Builder(this)
            builder.setMessage("Do you want to play Again ?")
            builder.setTitle("It's a Draw😯😯")
            builder.setCancelable(false)
            builder.setPositiveButton("Yes") {
                    dialog, which -> dialog.cancel()
                binding.IV1.setImageResource(0)
                binding.IV2.setImageResource(0)
                binding.IV3.setImageResource(0)
                binding.IV4.setImageResource(0)
                binding.IV5.setImageResource(0)
                binding.IV6.setImageResource(0)
                binding.IV7.setImageResource(0)
                binding.IV8.setImageResource(0)
                binding.IV9.setImageResource(0)
                listGame[0] = 2
                listGame[1] = 2
                listGame[2] = 2
                listGame[3] = 2
                listGame[4] = 2
                listGame[5] = 2
                listGame[6] = 2
                listGame[7] = 2
                listGame[8] = 2
                hitted[0] = 0
                hitted[1] = 0
                hitted[2] = 0
                hitted[3] = 0
                hitted[4] = 0
                hitted[5] = 0
                hitted[6] = 0
                hitted[7] = 0
                hitted[8] = 0
            }
            builder.setNegativeButton("No") {
                    dialog, which -> finish()
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }
    }
}
