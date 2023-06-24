package aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import aims.cart.Cart;
import aims.media.Media;
import aims.media.Playable;

public class MediaStore extends JPanel implements ActionListener{
    private Media media;
    public MediaStore(Media media){
        this.media=media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(),Font.PLAIN,20));
        title.setAlignmentX(CENTER_ALIGNMENT);
        
        JLabel cost = new JLabel(""+ media.getCost()+" $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton addToCartButton = new JButton("Add to cart");
        addToCartButton.addActionListener(this); // Registering the ActionListener
        container.add(addToCartButton);
        if (media instanceof Playable){

            JButton playButton = new JButton("Play");
            playButton.addActionListener(this); // Registering the ActionListener
            container.add(playButton);

        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);
        
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add to cart")) {
            // Handle the "Add to cart" button action here
            JDialog dialog = new JDialog();
            dialog.setTitle("Added to Cart");
            JLabel cartLabel = new JLabel("Item added to cart: " + media.getTitle());
            dialog.getContentPane().add(cartLabel);
            dialog.setSize(300, 200);
            dialog.setLocationRelativeTo(null); // Center the dialog on the screen
            dialog.setVisible(true);
        } else if (e.getActionCommand().equals("Play")) {
            // Handle the "Play" button action here
            JDialog dialog = new JDialog();
            JLabel l = new JLabel("Playing: " + media.getTitle());
            l.setHorizontalAlignment(JLabel.CENTER);
            l.setVerticalAlignment(JLabel.CENTER);
            dialog.getContentPane().add(l);
            dialog.setSize(300, 200);
            dialog.setLocationRelativeTo(null); // Center the dialog on the screen
            dialog.setVisible(true);
        }
    }  
}