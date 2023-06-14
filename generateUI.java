//Ar_Lazy_Dev
//Java Music Player
import javax.swing.*;

public class generateUI {

    //Declaring all the class variables

    //setting up the frame
    JFrame myFrame;

    //setting up the control buttons
    JButton playPauseButton;
    JButton replayButton;
    JButton stopButton;

    //setting up the 'add song' button
    JButton searchSongButton;

    //setting up the label where the song name will pop up
    JLabel songLabel;

    //setting up the two panels which will hold all the components together
    JPanel displayPanel;
    JPanel controlPanel;
    
    public void initUI(){

        myFrame = new JFrame();

        playPauseButton = new JButton();
        replayButton = new JButton();
        stopButton = new JButton();

        songLabel = new JLabel();

        displayPanel = new JPanel();
        controlPanel = new JPanel(); 
    }

    public void initButton(JButton button){

    }
}
