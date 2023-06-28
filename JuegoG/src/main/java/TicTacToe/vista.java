/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToe;

/**
 *
 * @author usuario
 */
public class vista extends javax.swing.JFrame {

    /**
     * Creates new form vista
     */
    public vista() {
        import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    private JButton[][] buttons;
    private JLabel scoreLabel;
    private int currentPlayer;
    private int moves;
    private int player1Score;
    private int player2Score;

    public TicTacToe() {
        setTitle("Gato");
        setSize(300, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 3));

        buttons = new JButton[3][3];
        currentPlayer = 1;
        moves = 0;
        player1Score = 0;
        player2Score = 0;

        // Crear botones
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton();
                buttons[row][col].addActionListener(this);
                add(buttons[row][col]);
            }
        }

        scoreLabel = new JLabel("Puntaje:\nJugador 1: 0\nJugador 2: 0", SwingConstants.CENTER);
        add(scoreLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button.getText().equals("")) {
            button.setText(currentPlayer == 1 ? "X" : "O");
            moves++;

            if (checkWin()) {
                JOptionPane.showMessageDialog(this, "El jugador " + (currentPlayer == 1 ? "1" : "2") + " ha ganado.");
                if (currentPlayer == 1) {
                    player1Score++;
                } else {
                    player2Score++;
                }
                resetBoard();
            } else if (moves == 9) {
                JOptionPane.showMessageDialog(this, "El juego ha terminado en empate.");
                resetBoard();
            } else {
                currentPlayer = currentPlayer == 1 ? 2 : 1;
            }
            updateScoreLabel();
        }
    }

    private boolean checkWin() {
        // Comprobar filas
        for (int row = 0; row < 3; row++) {
            if (!buttons[row][0].getText().equals("") && buttons[row][0].getText().equals(buttons[row][1].getText()) &&
                    buttons[row][1].getText().equals(buttons[row][2].getText())) {
                return true;
            }
        }
        // Comprobar columnas
        for (int col = 0; col < 3; col++) {
            if (!buttons[0][col].getText().equals("") && buttons[0][col].getText().equals(buttons[1][col].getText()) &&
                    buttons[1][col].getText().equals(buttons[2][col].getText())) {
                return true;
            }
        }
        // Comprobar diagonales
        if (!buttons[0][0].getText().equals("") && buttons[0][0].getText().equals(buttons[1][1].getText()) &&
                buttons[1][1].getText().equals(buttons[2][2].getText())) {
            return true;
        }
        if (!buttons[0][2].getText().equals("") && buttons[0][2].getText().equals(buttons[1][1].getText()) &&
               


   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
