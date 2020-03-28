/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;
// to define node properties
import problem5.student.Student;

public class Node {
    private Student s;
    private Node next;

    public Node(Student s) {
        this.s = s;
        next = null;
    }
    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
