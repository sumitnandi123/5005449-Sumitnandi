class Task{
    int taskId;
    String taskName;
    String status;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
}
public int getTaskId() {
    return taskId;
}

public String getTaskName() {
    return taskName;
}

public String getStatus() {
    return status;
}

@Override
public String toString() {
    return "Task(ID: " + taskId + ", Name: " + taskName + ", Status: " + status + ")";
}
}

class Node{
    Task task;
    Node next;

    public Node(Task task){
        this.task=task;
        this.next=null;
    }

    }

    class LinkedList
    {
        private Node head;
        public LinkedList() 
        {
            this.head = null;
        }

        public void insert(Task task) {
            Node newNode = new Node(task);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

    public Task searchTask(int taskId){
        Node temp=head;

        while(temp!=null){
            if(temp.task.getTaskId()==taskId){
                return temp.task;
            }

            temp=temp.next;
        }
        return null;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    public boolean deleteTask(int taskId) {
        Node current = head;
        Node previous = null;

        while (current != null && current.task.getTaskId() != taskId) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        if (previous == null) {
            head = current.next; 
        } else {
            previous.next = current.next;
        }
        return true;
    }
    }
    public class Task_ManagementSystem {
        public static void main(String[] args) {
            LinkedList taskList = new LinkedList();
    
            taskList.insert(new Task(1, "Task 1", "Pending"));
            taskList.insert(new Task(2, "Task 2", "Completed"));
            taskList.insert(new Task(3, "Task 3", "In Progress"));
    
            Task task = taskList.searchTask(2);
            if (task != null) {
                System.out.println("Task found: " + task);
            } else {
                System.out.println("Task not found");
            }
    
            System.out.println("All tasks:");
            taskList.traverse();
    
            boolean isDeleted = taskList.deleteTask(2);
            if (isDeleted) {
                System.out.println("Task deleted successfully");
            } else {
                System.out.println("Task not found");
            }
    
            System.out.println("remaining  tasks after deletion:");
            taskList.traverse(); 
        }
    }
    
