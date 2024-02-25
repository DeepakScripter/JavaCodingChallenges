
// OnlineTest class extends JFrame and implements ActionListener
// Importing necessary packages and classes
import java.awt.LayoutManager; // For managing the layout of components in GUI
import java.awt.event.ActionEvent; // For handling action events
import java.awt.event.ActionListener; // Interface for handling action events
import javax.swing.ButtonGroup; // For creating a group of radio buttons
import javax.swing.JButton; // For creating buttons
import javax.swing.JFrame; // The main window/frame in a GUI application
import javax.swing.JLabel; // For displaying text labels
import javax.swing.JOptionPane; // For displaying dialog boxes
import javax.swing.JRadioButton; // For creating radio buttons
// OnlineTest class definition
class OnlineTest extends JFrame implements ActionListener {
    // Instance variables
    JLabel l = new JLabel(); // Label for displaying text
    JRadioButton[] jb = new JRadioButton[5]; // Array of radio buttons for answer options
    JButton b1; // Button for moving to the next question
    JButton b2; // Button for bookmarking a question
    ButtonGroup bg; // Group of radio buttons to ensure only one is selected at a time
    int count = 0; // Counter for correct answers
    int current = 0; // Current question number
    int x = 1; // Bookmark counter
    int y = 1; // Variable for loop iteration
    int now = 0; // Variable to store the current question when bookmarking
    int[] m = new int[10]; // Array to store bookmarked questions

    // Constructor for OnlineTest class
    OnlineTest(String s) {
        super(s); // Call the constructor of the superclass (JFrame) with the specified title
        this.add(this.l); // Add the label to the frame
        this.bg = new ButtonGroup(); // Initialize the button group

        // Creating radio buttons and adding them to the button group
        for (int i = 0; i < 5; ++i) {
            this.jb[i] = new JRadioButton(); // Create a new radio button
            this.add(this.jb[i]); // Add the radio button to the frame
            this.bg.add(this.jb[i]); // Add the radio button to the button group
        }

        // Creating buttons and adding action listeners
        this.b1 = new JButton("Next"); // Create a "Next" button
        this.b2 = new JButton("Bookmark"); // Create a "Bookmark" button
        this.b1.addActionListener(this); // Add an action listener to the "Next" button
        this.b2.addActionListener(this); // Add an action listener to the "Bookmark" button
        this.add(this.b1); // Add the "Next" button to the frame
        this.add(this.b2); // Add the "Bookmark" button to the frame

        // Setting up the layout and properties of the frame
        this.set(); // Call the set() method to set up questions and answer options
        this.l.setBounds(30, 40, 450, 20); // Set bounds for the label
        this.jb[0].setBounds(50, 80, 100, 20); // Set bounds for the first radio button
        this.jb[1].setBounds(50, 110, 100, 20); // Set bounds for the second radio button
        this.jb[2].setBounds(50, 140, 100, 20); // Set bounds for the third radio button
        this.jb[3].setBounds(50, 170, 100, 20); // Set bounds for the fourth radio button
        this.b1.setBounds(100, 240, 100, 30); // Set bounds for the "Next" button
        this.b2.setBounds(270, 240, 100, 30); // Set bounds for the "Bookmark" button
        this.setDefaultCloseOperation(3); // Set default close operation (exit on close)
        this.setLayout((LayoutManager) null); // Set the layout manager to null (no layout manager)
        this.setLocation(250, 100); // Set the location of the frame
        this.setVisible(true); // Set the frame to be visible
        this.setSize(600, 350); // Set the size of the frame

    }

    // actionPerformed method to handle button clicks
    public void actionPerformed(ActionEvent e) {
        // Handling "Next" button click
        if (e.getSource() == this.b1) {
            if (this.check()) { // Check if the selected answer is correct
                ++this.count; // Increment the count of correct answers
            }

            ++this.current; // Move to the next question
            this.set(); // Set up the next question
            if (this.current == 9) {
                this.b1.setEnabled(false); // Disable the "Next" button when reaching the last question
                this.b2.setText("Result"); // Change the text of the "Bookmark" button to "Result"
            }
        }

        // Handling "Bookmark" button click
        if (e.getActionCommand().equals("Bookmark")) {
            JButton bk = new JButton("Bookmark" + this.x); // Create a new bookmark button
            bk.setBounds(480, 20 + 30 * this.x, 100, 30); // Set bounds for the bookmark button
            this.add(bk); // Add the bookmark button to the frame
            bk.addActionListener(this); // Add an action listener to the bookmark button
            this.m[this.x] = this.current; // Store the current question number in the array
            ++this.x; // Increment the bookmark counter
            ++this.current; // Move to the next question
            this.set(); // Set up the next question
            if (this.current == 9) {
                this.b2.setText("Result"); // Change the text of the "Bookmark" button to "Result"
            }

            this.setVisible(false); // Hide and then show the frame to update changes
            this.setVisible(true);
        }

        // Handling bookmark button clicks
        int i = 0;

        for (int y = 1; i < this.x; ++y) {
            if (e.getActionCommand().equals("Bookmark" + y)) {
                if (this.check()) { // Check if the selected answer is correct
                    ++this.count; // Increment the count of correct answers
                }

                this.now = this.current; // Store the current question number
                this.current = this.m[y]; // Set the current question number to the bookmarked question
                this.set(); // Set up the bookmarked question
                ((JButton) e.getSource()).setEnabled(false); // Disable the clicked bookmark button
                this.current = this.now; // Restore the current question number
            }

            ++i;
        }

        // Handling "Result" button click
        if (e.getActionCommand().equals("Result")) {
            if (this.check()) { // Check if the selected answer is correct
                ++this.count; // Increment the count of correct answers
            }

            ++this.current; // Move to the next question
            JOptionPane.showMessageDialog(this, "correct ans=" + this.count); // Display the result
            System.exit(0); // Exit the program
        }
    }

    // Method to set up questions and answer options
    void set() {
        this.jb[4].setSelected(true); // Set the fifth radio button as selected by default
        if (this.current == 0) {
            this.l.setText("Que1: Which one among these is not a datatype");
            this.jb[0].setText("int");
            this.jb[1].setText("Float");
            this.jb[2].setText("boolean");
            this.jb[3].setText("char");
        }

        // Similar blocks for other questions...
        // ...

        this.l.setBounds(30, 40, 450, 20); // Set bounds for the label
        int i = 0;

        // Setting the bounds for radio buttons
        for (int j = 0; i <= 90; ++j) {
            this.jb[j].setBounds(50, 80 + i, 200, 20); // Set bounds for each radio button
            i += 30;
        }
    }

        // Method to check the selected answer
    boolean check() {
        if (this.current == 0) {
            return this.jb[1].isSelected();    // Check if the second radio button is selected
        } else if (this.current == 1) {
            return this.jb[2].isSelected();    // Check if the third radio button is selected
        } else if (this.current == 2) {
            return this.jb[3].isSelected();    // Check if the fourth radio button is selected
        } else if (this.current == 3) {
            return this.jb[0].isSelected();    // Check if the first radio button is selected
        } else if (this.current == 4) {
            return this.jb[2].isSelected();    // Check if the third radio button is selected
        } else if (this.current == 5) {
            return this.jb[2].isSelected();    // Check if the third radio button is selected
        } else if (this.current == 6) {
            return this.jb[1].isSelected();    // Check if the second radio button is selected
        } else if (this.current == 7) {
            return this.jb[3].isSelected();    // Check if the fourth radio button is selected
        } else if (this.current == 8) {
            return this.jb[1].isSelected();    // Check if the second radio button is selected
        } else {
            return this.current == 9 ? this.jb[2].isSelected() : false;   // Check if the third radio button is selected for the last question
        }
    }

    // Main method to run the program
    public static void main(String[] s) {
        new OnlineTest("Online Test Of Java");   // Create an instance of the OnlineTest class with the specified title
    }
}

