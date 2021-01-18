package com.idn.smart.tiyas.adz_dzikrapp


import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_dzikir.*

@Suppress("DEPRECATION")
class DzikirActivity : AppCompatActivity() {
    private var dzikir : TextView? =  null
    private var zikir = 0
    private var vibe : Vibrator? = null
   // private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir)



        dzikir = findViewById<View>(R.id.dzikir) as TextView
        vibe = getSystemService(VIBRATOR_SERVICE) as Vibrator

    }

     fun  Subhanallah(view: View?){
         val mediaPlayer : MediaPlayer?  = MediaPlayer.create(applicationContext,R.raw.tasbih)
        mediaPlayer?.start()
         zikir += 1
        tampil(zikir)
         vibe!!.vibrate(100)
    }

    fun  Alhamdulillah(view: View?){
        val mediaPlayer : MediaPlayer?  = MediaPlayer.create(applicationContext,R.raw.tahmid)
        mediaPlayer?.start()
        zikir += 1
        tampil(zikir)
        vibe!!.vibrate(100)
    }

    fun  AllahuAkbar(view: View?){
        val mediaPlayer : MediaPlayer?  = MediaPlayer.create(applicationContext,R.raw.takbir)
        mediaPlayer?.start()
        zikir += 1
        tampil(zikir)
        vibe!!.vibrate(100)
    }

    fun  Lailahaillallah(view: View?){
        val mediaPlayer : MediaPlayer?  = MediaPlayer.create(applicationContext,R.raw.tahlil)
        mediaPlayer?.start()
        zikir += 1
        tampil(zikir)
        vibe!!.vibrate(100)
    }

    private fun tampil(zikir: Int) {
        dzikir!!.text = "" + zikir

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.reset -> {
                val mediaPlayer : MediaPlayer? = null
                mediaPlayer?.stop()
                zikir = 0
                tampil(zikir)
                super.onOptionsItemSelected(item)
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}