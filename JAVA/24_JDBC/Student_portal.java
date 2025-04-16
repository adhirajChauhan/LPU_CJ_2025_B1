// //JDBC Setup
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.sql.*;
// import java.util.ArrayList;
// import java.util.List;

// class DBConnection{
//     private static final String url = "jdbc:mysql://localhost:3306/mydb";
//     private static final String username = "root";
//     private static final String password = "Pass@1212";

//     public static Connection getConnection() throws SQLException
//     {
//         return DriverManager.getConnection(url,username,password);
//     }

// }

// //All DB operations
// class StudentDBO{
//     //addStudent
//     void addStudents(String name, int age, double marks)throws SQLException{
//         String query = "INSERT INTO students (name, age, marks) VALUES(?,?,?)";
//         try(Connection connection = DBConnection.getConnection()){
//             PreparedStatement preparedStatement = connection.prepareStatement(query);
//             preparedStatement.setString(1,name);
//             preparedStatement.setInt(2,age);
//             preparedStatement.setDouble(3,marks);
//             preparedStatement.executeUpdate();
//         }
//     }

//     //getAllStudents
//     ArrayList<String> getAllStudents() throws  SQLException{
//         ArrayList<String> students = new ArrayList<>();
//         String query = "SELECT * FROM students";
//         try(Connection connection = DBConnection.getConnection()){
//             Statement statement = connection.createStatement();
//             ResultSet resultSet = statement.executeQuery(query);
//             while (resultSet.next()){
//                 String record = resultSet.getInt("id") + " | "
//                         + resultSet.getString("name") + " | "
//                         + resultSet.getInt("age") + " | "
//                         + resultSet.getDouble("marks");
//                 students.add(record);
//             }
//         }
//         return students;
//     }

//     //deleteStudent
//     void deleteStudent(String name) throws SQLException{
//         String query = "DELETE FROM students WHERE name = ?";
//         try(Connection connection = DBConnection.getConnection()){
//             PreparedStatement preparedStatement = connection.prepareStatement(query);
//             preparedStatement.setString(1, name);
//             preparedStatement.executeUpdate();
//         }
//     }

//     //searchStudent
//     String searchStudent(String name) throws SQLException{
//         String query = "SELECT * FROM students WHERE name = ?";
//         try(Connection connection = DBConnection.getConnection()){
//             PreparedStatement preparedStatement = connection.prepareStatement(query);
//             preparedStatement.setString(1, name);
//             ResultSet rs = preparedStatement.executeQuery();

//             if(rs.next()){
//                 return rs.getInt("id") + " | " + rs.getString("name") + " | "
//                         + rs.getInt("age") + " | " + rs.getDouble("marks");
//             }
//         }
//         return "Student not found";
//     }

//     //updateStudent


// }
// //Swing GUI
// class StudentPortalGUI extends JFrame {

//     private final StudentDBO dbo = new StudentDBO();
//     private final JTextArea outputArea = new JTextArea();

//     public  StudentPortalGUI(){
//         setTitle("Student Portal");
//         setSize(500, 500);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         //top buttons
//         JPanel buttonPanel = new JPanel(new GridLayout(1,5));
//         JButton viewButton = new JButton("View All");
//         buttonPanel.add(viewButton);
//         JButton addButton = new JButton("Add");
//         buttonPanel.add(addButton);
//         JButton delButton = new JButton("Delete");
//         buttonPanel.add(delButton);


//         //output area
//         outputArea.setEditable(false);
//         JScrollPane scroll = new JScrollPane(outputArea);

//         add(buttonPanel, BorderLayout.NORTH);
//         add(scroll, BorderLayout.CENTER);

//         //button actions
//         viewButton.addActionListener(new ActionListener() {

//                 @Override
//                 public void actionPerformed(ActionEvent e) {
//                     try{
//                     ArrayList<String> students = dbo.getAllStudents();
//                     outputArea.setText("Student List : \n");
//                     students.forEach(s -> outputArea.append(s + "\n"));
//                     }
//                     catch(SQLException exc){
//                         System.out.println(exc.getMessage());
//                     }
//                 }
//         });

//         addButton.addActionListener(e -> {
//                 JTextField name = new JTextField();
//                 JTextField age = new JTextField();
//                 JTextField marks = new JTextField();

//                 Object[] feilds = {
//                         "Name : ", name,
//                         "Age : ", age,
//                         "Marks : ", marks
//                 };
//                 int result = JOptionPane.showConfirmDialog(this, feilds,"Add Students", JOptionPane.OK_CANCEL_OPTION);
//                 if(result == JOptionPane.OK_OPTION){
//                     try {
//                         dbo.addStudents(name.getText(), Integer.parseInt(age.getText()), Double.parseDouble(marks.getText()));
//                         outputArea.setText("Student added successfully");
//                     }
//                     catch (SQLException exc){
//                         System.out.println(exc.getMessage());
//                     }
//                 }


//         });

//         delButton.addActionListener(e->{
//             String name = JOptionPane.showInputDialog(this, "Enter name to delete : ");

//             if(name != null){
//                 try{
//                     dbo.deleteStudent(name);
//                     outputArea.setText("Student deleted successfully");

//                 } catch (SQLException ex) {
//                     throw new RuntimeException(ex);
//                 }
//             }

//         });

//         setVisible(true);
//     }



// }


// public class StudentPortal_1 {
//     public static void main(String[] args) {
//         new StudentPortalGUI();
//     }
// }

