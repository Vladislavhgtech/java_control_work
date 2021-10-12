package mainPackage;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Form1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fioField;
	private JTextField yearField;
	private JTextField monthField;
	private JTextField dayField;
	private JTextField hourField;
	private JTextField placeField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form1 frame = new Form1();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	boolean isNumber(String str) {

		if (str == null || str.isEmpty())
			return false;
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i)))
				return false;
		}
		return true;

	}

	int getPrior() {

		return 0;
	}

	boolean isHour(String str) {

		if (isNumber(str)) {
			int mounth = Integer.parseInt(str);
			if (mounth >= 0 && mounth <= 24) {
				return true;
			} else
				return false;

		}
		return false;

	}

	public static boolean isDateValid(int year, int month, int day) {
		boolean dateIsValid = true;
		try {
			LocalDate.of(year, month, day);
		} catch (DateTimeException e) {
			dateIsValid = false;
		}
		return dateIsValid;
	}

	public static boolean isNameValid(String name) {

		boolean valid = name.matches("(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$");

		// System.out.println("Name: " + name + "\nValid: " + valid);

		return valid;
	}

	public static boolean isStrEmpty(String str) {
		return str.trim().isEmpty();
	}

	/**
	 * Create the frame.
	 */
	public Form1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 70, 550, 306);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		JPanel panelAll = new JPanel();
		layeredPane.add(panelAll, "name_17622808580600");
		panelAll.setLayout(null);

		fioField = new JTextField();
		fioField.setBounds(10, 42, 234, 27);
		fioField.setToolTipText("");
		panelAll.add(fioField);
		fioField.setColumns(10);

		yearField = new JTextField();
		yearField.setBounds(10, 162, 44, 20);
		panelAll.add(yearField);
		yearField.setColumns(10);

		monthField = new JTextField();
		monthField.setBounds(10, 193, 44, 20);
		monthField.setColumns(10);
		panelAll.add(monthField);

		dayField = new JTextField();
		dayField.setBounds(10, 224, 44, 20);
		dayField.setColumns(10);
		panelAll.add(dayField);

		JLabel lblNewLabel = new JLabel("Год");
		lblNewLabel.setBounds(64, 165, 46, 14);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		panelAll.add(lblNewLabel);

		JLabel lblNewLabel_3 = new JLabel("Месяц от 1 до 12");
		lblNewLabel_3.setBounds(64, 196, 111, 14);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		panelAll.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("День от 1 до 31");
		lblNewLabel_4.setBounds(64, 227, 96, 14);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		panelAll.add(lblNewLabel_4);

		hourField = new JTextField();
		hourField.setBounds(10, 255, 44, 20);
		hourField.setColumns(10);
		panelAll.add(hourField);

		JLabel lblNewLabel_4_1 = new JLabel("Часов от 0 до 24");
		lblNewLabel_4_1.setBounds(64, 258, 96, 14);
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		panelAll.add(lblNewLabel_4_1);

		JComboBox ComboBox = new JComboBox();
		ComboBox.setModel(new DefaultComboBoxModel(new String[] { "не важно", "обычно", "важно", "крайне важно" }));
		ComboBox.setBounds(375, 212, 165, 22);
		panelAll.add(ComboBox);

		JLabel lblNewLabel_5 = new JLabel("Приоритет:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_5.setBounds(295, 215, 67, 17);
		panelAll.add(lblNewLabel_5);

		placeField = new JTextField();
		placeField.setToolTipText("");
		placeField.setColumns(10);
		placeField.setBounds(295, 42, 234, 27);
		panelAll.add(placeField);

		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBounds(10, 124, 234, 27);
		panelAll.add(textField_1);

		JLabel lblFIOLabel = new JLabel("Введите ФИО английскими буквами:");
		lblFIOLabel.setBounds(10, 11, 225, 22);
		panelAll.add(lblFIOLabel);
		lblFIOLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFIOLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblFIOLabel_1 = new JLabel("Введите место деловой встречи");
		lblFIOLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFIOLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFIOLabel_1.setBounds(295, 11, 225, 22);
		panelAll.add(lblFIOLabel_1);

		JLabel lblFIOLabel_2 = new JLabel("Аэропорт вылета");
		lblFIOLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFIOLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFIOLabel_2.setBounds(10, 91, 225, 22);
		panelAll.add(lblFIOLabel_2);

		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setColumns(10);
		textField_2.setBounds(295, 124, 234, 27);
		panelAll.add(textField_2);

		JLabel lblFIOLabel_2_1 = new JLabel("Аэропорт прилёта");
		lblFIOLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFIOLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFIOLabel_2_1.setBounds(295, 91, 225, 22);
		panelAll.add(lblFIOLabel_2_1);

		JLabel lblFIOLabel_3 = new JLabel("Введите ФИО тех, кто будет на встрече:");
		lblFIOLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblFIOLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFIOLabel_3.setBounds(0, 9, 275, 22);
		panelAll.add(lblFIOLabel_3);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(170, 255, 44, 20);
		panelAll.add(textField);

		JLabel lblNewLabel_4_1_1 = new JLabel("Минут");
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_4_1_1.setBounds(224, 258, 96, 14);
		panelAll.add(lblNewLabel_4_1_1);

		JRadioButton birthRadioButton = new JRadioButton("День рождения");

		birthRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (birthRadioButton.isSelected()) {
					lblFIOLabel.setVisible(true);
					lblFIOLabel_1.setVisible(false);
					lblFIOLabel_3.setVisible(false);
					placeField.setVisible(false);
					lblFIOLabel_2.setVisible(false);
					lblFIOLabel_2_1.setVisible(false);
					textField_1.setVisible(false);
					textField_2.setVisible(false);
					fioField.setVisible(true);
					textField.setVisible(false);

				}
			}
		});
		birthRadioButton.setBounds(46, 20, 128, 23);
		contentPane.add(birthRadioButton);

		birthRadioButton.doClick();

		JRadioButton businessRadioButton = new JRadioButton("Деловая встреча");
		businessRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (businessRadioButton.isSelected()) {
					panelAll.setVisible(true);
					lblFIOLabel.setVisible(false);
					lblFIOLabel_1.setVisible(true);
					lblFIOLabel_3.setVisible(true);
					placeField.setVisible(true);
					lblFIOLabel_2.setVisible(false);
					lblFIOLabel_2_1.setVisible(false);
					textField_1.setVisible(false);
					textField_2.setVisible(false);
					fioField.setVisible(true);
					textField.setVisible(false);

				}
			}
		}

		);
		businessRadioButton.setBounds(190, 20, 136, 23);
		contentPane.add(businessRadioButton);

		JRadioButton airtravelRadioButton = new JRadioButton("Авиаперелёт");
		airtravelRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (airtravelRadioButton.isSelected()) {
					panelAll.setVisible(true);
					panelAll.setVisible(true);
					lblFIOLabel_1.setVisible(false);
					placeField.setVisible(false);
					lblFIOLabel_2.setVisible(true);
					lblFIOLabel_2_1.setVisible(true);
					textField_1.setVisible(true);
					textField_2.setVisible(true);
					fioField.setVisible(false);
					lblFIOLabel.setVisible(false);
					lblFIOLabel_3.setVisible(false);
					textField.setVisible(true);
				}
			}
		});
		airtravelRadioButton.setBounds(342, 20, 109, 23);
		contentPane.add(airtravelRadioButton);

		ButtonGroup bg = new ButtonGroup();
		bg.add(businessRadioButton);
		bg.add(airtravelRadioButton);
		bg.add(birthRadioButton);

		JButton saveButton = new JButton("SAVE");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (birthRadioButton.isSelected()) {

					ArrayList<Integer> date = new ArrayList<Integer>();

					String FIO = fioField.getText();
					int prior = ComboBox.getSelectedIndex();

					if (isNumber(yearField.getText()) & isNumber(monthField.getText()) & isNumber(dayField.getText())
							& isNumber(hourField.getText()) & !isStrEmpty(fioField.getText())
							&& isHour(hourField.getText()) && isDateValid(Integer.parseInt(yearField.getText()),
									Integer.parseInt(monthField.getText()), Integer.parseInt(dayField.getText()))) {
						date.add(Integer.parseInt(yearField.getText()));
						date.add(Integer.parseInt(monthField.getText()));
						date.add(Integer.parseInt(dayField.getText()));
						date.add(Integer.parseInt(hourField.getText()));
						Birthday birth = new Birthday(date.get(0), date.get(1) - 1, date.get(2), date.get(3), prior,
								FIO);
						System.out.println(birth.toString());

					}

					else {
						System.out.println("ОШИБКА!!! Проверьте входные данные!!!!");
						JOptionPane.showMessageDialog(null, "ОШИБКА!!!! Проверьте входные данные!!!!");

					}
					;

				} else if (businessRadioButton.isSelected()) {

					ArrayList<Integer> date = new ArrayList<Integer>();

					String FIO = fioField.getText();
					int prior = ComboBox.getSelectedIndex();
					String place = placeField.getText();

					if (isNumber(yearField.getText()) & isNumber(monthField.getText()) & isNumber(dayField.getText())
							& isNumber(hourField.getText()) & !isStrEmpty(fioField.getText())
							&& isHour(hourField.getText()) && isDateValid(Integer.parseInt(yearField.getText()),
									Integer.parseInt(monthField.getText()), Integer.parseInt(dayField.getText()))) {
						date.add(Integer.parseInt(yearField.getText()));
						date.add(Integer.parseInt(monthField.getText()));
						date.add(Integer.parseInt(dayField.getText()));
						date.add(Integer.parseInt(hourField.getText()));

						BusinessMeeting business = new BusinessMeeting(date.get(0), date.get(1) - 1, date.get(2),
								date.get(3), prior, place, fioField.getText().split(", "));
						System.out.println(business.toString());

					}

					else {
						System.out.println("ОШИБКА!!! Проверьте входные данные!!!!");
						JOptionPane.showMessageDialog(null, "ОШИБКА!!!! Проверьте входные данные!!!!");
					}
					;
				} else if (airtravelRadioButton.isSelected()) {
					ArrayList<Integer> date = new ArrayList<Integer>();

					String arrival = textField_1.getText();
					String departure = textField_2.getText();
					int prior = ComboBox.getSelectedIndex();

					if (!isStrEmpty(textField_1.getText()) & !isStrEmpty(textField_2.getText())
							& isNumber(yearField.getText()) & isNumber(monthField.getText())
							& isNumber(dayField.getText()) & isNumber(hourField.getText())
							&& isHour(hourField.getText()) && isDateValid(Integer.parseInt(yearField.getText()),
									Integer.parseInt(monthField.getText()), Integer.parseInt(dayField.getText()))) {
						date.add(Integer.parseInt(yearField.getText()));
						date.add(Integer.parseInt(monthField.getText()));
						date.add(Integer.parseInt(dayField.getText()));
						date.add(Integer.parseInt(hourField.getText()));
						date.add(Integer.parseInt(textField.getText()));

						AirTravel travel = new AirTravel(date.get(0), date.get(1) - 1, date.get(2), date.get(3),
								date.get(4), prior, textField_1.getText(), textField_2.getText());
						System.out.println(travel.toString());

					}

					else {
						System.out.println("ОШИБКА!!! Проверьте входные данные!!!!");
						JOptionPane.showMessageDialog(null, "ОШИБКА!!!! Проверьте входные данные!!!!");
					}
					;

				}

			}
		});
		saveButton.setBounds(481, 20, 89, 23);
		contentPane.add(saveButton);

	}
}
