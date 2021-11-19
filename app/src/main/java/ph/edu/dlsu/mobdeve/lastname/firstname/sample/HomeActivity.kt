package ph.edu.dlsu.mobdeve.lastname.firstname.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ph.edu.dlsu.mobdeve.lastname.firstname.sample.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    var binding: ActivityHomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        var bundle = intent.extras
        var username = bundle!!.getString("username")

        var email = intent.getStringExtra("email")

        Log.i("Home Activity", "username from Bundle:$username:")
        Log.i("Home Activity", "username from Extra:$email:")

        binding!!.tvContent.text ="HI $username :$email"
    }
}