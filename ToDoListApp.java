import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListApp extends JFrame {
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;

    public ToDoListApp() {
        // Set up the main window
        setTitle("Todo List App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create a default task list model
        taskListModel = new DefaultListModel<>();

        // Create a JList to display tasks
        taskList = new JList<>(taskListModel);

        // Create a JScrollPane to contain the task list
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Create buttons for adding, editing, completing, and deleting tasks
        JButton addButton = new JButton("Add Task");
        JButton editButton = new JButton("Edit Task");
        JButton completeButton = new JButton("Complete Task");
        JButton deleteButton = new JButton("Delete Task");

        // Add action listeners to the buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editTask();
            }
        });

        completeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                completeTask();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteTask();
            }
        });

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4));
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(completeButton);
        buttonPanel.add(deleteButton);

        // Create a panel for organizing components
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Add the main panel to the frame
        add(mainPanel);

        // Make the frame visible
        setVisible(true);
    }

    private void addTask() {
        String taskTitle = JOptionPane.showInputDialog(this, "Enter task title:");
        if (taskTitle != null && !taskTitle.trim().isEmpty()) {
            taskListModel.addElement(taskTitle);
        }
    }

    private void editTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            String currentTask = taskListModel.getElementAt(selectedIndex);
            String newTaskTitle = JOptionPane.showInputDialog(this, "Edit task:", currentTask);
            if (newTaskTitle != null && !newTaskTitle.trim().isEmpty()) {
                taskListModel.setElementAt(newTaskTitle, selectedIndex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a task to edit.");
        }
    }

    private void completeTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            String currentTask = taskListModel.getElementAt(selectedIndex);
            taskListModel.setElementAt("[Completed] " + currentTask, selectedIndex);
        } else {
            JOptionPane.showMessageDialog(this, "Select a task to complete.");
        }
    }

    private void deleteTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            taskListModel.remove(selectedIndex);
        } else {
            JOptionPane.showMessageDialog(this, "Select a task to delete.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ToDoListApp();
            }
        });
    }
}
