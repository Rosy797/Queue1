package com.company;

import java.util.*;

  import java.util.LinkedList;
import java.util.Queue;
    public class Main {



            public static void main(String[] args) {
                Queue<Integer> q
                        = new LinkedList<>();
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                for (int i = 0; i < n; i++)
                    q.add(i);


                System.out.println("Elements of queue "
                        + q);


                int removedele = q.remove();
                System.out.println("removed element-"
                        + removedele);

                System.out.println(q);


                int head = q.peek();
                System.out.println("head of queue-"
                        + head);


                int size = q.size();
                System.out.println("Size of queue-"
                        + size);
            }
        }

