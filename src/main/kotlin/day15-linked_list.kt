// Day 15
//
// Complete the insert function in your editor so that it creates a new Node (pass "data" as the Node constructor
// argument) and inserts it at the tail of the linked list referenced by the head parameter. Once the new node is added,
// return the head reference to the node.

import java.io.*
import java.util.*

class Node(var data:Int, var next:Node? = null)

    fun insert(head:Node?, data:Int): Node? {
        var current = head
        if (current == null) {
            current = Node(data)
            return current
        }
        while (current != null) {
            if (current.next != null) {
                current = current.next
            } else {
                current.next = Node(data)
                break
            }
        }
        return head
    }
    fun display(head:Node?) {
        var start = head
        while (start != null)
        {
            print(start.data.toString() + " ")
            start = start.next
        }
    }

    fun main() {
        val sc = Scanner(System.`in`)
        var head:Node? = null
        var N = sc.nextInt()
        while (N-- > 0)
        {
            var ele = sc.nextInt()
            head = insert(head, ele)
        }
        display(head)
        sc.close()
    }