package io.github.fvarrui.makinito.ui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

import io.github.fvarrui.makinito.config.Config;
import io.github.fvarrui.makinito.i18n.Messages;
import io.github.fvarrui.makinito.ui.resources.Icons;

@SuppressWarnings("serial")
public class AboutDialog extends JDialog {
	
	public AboutDialog(Container padre) {
		initDialog();
		initComponents();
		setLocationRelativeTo(padre);
	}
	
	private void initDialog() {
		setTitle(Messages.getString("aboutDialog.title"));
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(320, 300);
		setModal(true);
	}
	
	private void initComponents() {
		
		JLabel aboutLabel = new JLabel(new ImageIcon(Icons.LOGO_BIG));
		aboutLabel.setHorizontalTextPosition(JLabel.CENTER);
		aboutLabel.setVerticalTextPosition(JLabel.BOTTOM);
		aboutLabel.setText(Messages.getString("aboutDialog.aboutLabel.text", Config.getVersion()));
		
		getContentPane().add(aboutLabel, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new AboutDialog(null).setVisible(true);
	}
	
}
