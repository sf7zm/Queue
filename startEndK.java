public static void startEndK(Deque<String> dq,int k){
     int size = dq.size();
      for (int i = 0; i < k; i++) {
          dq.addLast(dq.peek());
          dq.addLast(dq.poll());
      }
      for (int i = 0; i < size-2*k ; i++) {
          dq.addLast(dq.poll());
      }
      for (int i = 0; i < k; i++) {
          dq.addLast(dq.peek());
          dq.addLast(dq.poll());
      }

  }
