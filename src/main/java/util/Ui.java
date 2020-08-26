package util;

import task.Task;

import java.util.Scanner;

/**
 * The UI class deals with interactions with the user and prints responses accordingly.
 */
public class Ui {
    /** Scanner to read in user input input. */
    Scanner sc;

    /**
     * Creates a UI instance and create a new scanner object.
     */
    public Ui() {
        sc = new Scanner(System.in);
    }

    /**
     * Returns a string describing a command.
     * 
     * @return A string describing a command.
     */
    public String readCommand() {
        return sc.nextLine();
    }

    /**
     * Prints a line divider.
     */
    public void showLine() {
        System.out.println("------------------------------------------------------");
    }

    /**
     * Prints the welcome message.
     */
    public void showWelcome() {
        System.out.println("Serina here, how can I assist you?");
        this.showLine();
    }

    /**
     * Prints the string representation of a task.
     */
    public void showTask(Task task, int taskNum) {
        System.out.println(taskNum + ". " + task);
    }

    /**
     * Prints the add task acknowledgement.
     */
    public void showAddTask(Task task, int taskNum) {
        System.out.println("The following task has been added: ");
        this.showTask(task, taskNum);
        this.showLine();
    }

    /**
     * Prints the delete task acknowledgement.
     */
    public void showDeleteTask(Task task, int taskNum) {
        System.out.println("The following task has been deleted: ");
        this.showTask(task, taskNum);
        this.showLine();
    }

    /**
     * Prints the task mark as done acknowledgement.
     */
    public void showDoneTask(Task task, int taskNum) {
        System.out.println("The following task has been marked as done: ");
        this.showTask(task, taskNum);
        this.showLine();
    }

    /**
     * Prints the goodbye message.
     */
    public void showGoodbye() {
        System.out.println("Alright, call me again if you need me.");
    }

    /**
     * Prints the error message.
     */
    public void showError(String err) {
        System.out.println(err);
        this.showLine();
    }
}