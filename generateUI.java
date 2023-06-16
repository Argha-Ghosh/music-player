//Ar_Lazy_Dev
//Java Music Player

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class generateUI implements ActionListener{

    //Declaring all the class variables

    //main frame
    JFrame myFrame;

    //control buttons
    JButton playPauseButton;
    JButton replayButton;
    JButton stopButton;

    //the 'add song' button
    JButton searchSongButton;

    //label where the song name will pop up
    JLabel songLabel;

    //panels which will hold all the components together
    JPanel displayPanel;
    JPanel controlPanel;
    
    //set initial values of all the elements 
    public void initUI(){

        myFrame = new JFrame();

        playPauseButton = new JButton();
        replayButton = new JButton();
        stopButton = new JButton();
        searchSongButton = new JButton();

        songLabel = new JLabel();

        displayPanel = new JPanel();
        controlPanel = new JPanel(); 

        //initializing all the buttons
        initButton(playPauseButton);
        initButton(replayButton);
        initButton(stopButton);
        initButton(searchSongButton);

        //setting up the display panel layout
        displayPanel.setLayout(new GridLayout(1, 2));

        displayPanel.add(songLabel);
        displayPanel.add(searchSongButton);

        //setting up the play controls panel
        controlPanel.setLayout(new GridLayout(1, 3));

        controlPanel.add(stopButton);
        controlPanel.add(playPauseButton);
        controlPanel.add(replayButton);

        //setting up the frame

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(600, 500);
        myFrame.setResizable(false);
        myFrame.setLocationRelativeTo(null);
        myFrame.setTitle("Music Player");
        myFrame.setIconImage(new ImageIcon("music.png").getImage());
        myFrame.setVisible(true);

        //adding elements to the frame

        myFrame.add(displayPanel, BorderLayout.NORTH);
        myFrame.add(controlPanel, BorderLayout.SOUTH);

    }

    public void initButton(JButton button){
        button.setFocusable(false);
        button.setOpaque(false);
        button.setBackground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //code here
    }
}
