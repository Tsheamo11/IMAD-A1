import com.example.mealstosuggest.R


import
        
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private fun clear() {
}

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components
        val timeInput: TextView = findViewById(R.id.timeInput)
        val suggestionOutput: TextView = findViewById(R.id.suggestionOutput)
        val suggestButton: Button = findViewById(R.id.suggestButton)
        val resetButton: Button = findViewById(R.id.resetButton)


        // Set click listener for the Suggest button
        suggestButton.setOnClickListener {
            // Get the time input from the EditText and convert to lowercase

            // Determine the meal suggestion using if statements
            val suggestion = when (timeInput.text.toString().trim().lowercase()) {
                "morning" -> {
                    "Eggs"
                }

                "mid-morning" -> {
                    "Fruit"
                }

                "afternoon" -> {
                    "Sandwich"
                }

                "mid-afternoon" -> {
                    "Cake"
                }

                "dinner" -> {
                    "Pasta"
                }

                "after dinner" -> {
                    "Ice cream"
                }

                else -> {
                    "Invalid time. Please enter Morning, Mid-morning, Afternoon, Mid-afternoon, Dinner, or After Dinner."
                }
            }

            // Display the meal suggestion in the TextView
            suggestionOutput.text = suggestion
        }

        // Set click listener for the Reset button
        resetButton.setOnClickListener {
            // Clear the time input and suggestion output
            timeInput.run {
                clear()

                suggestionOutput.text = ""
            }
        }
    }}
