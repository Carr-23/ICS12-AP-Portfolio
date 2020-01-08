public void cocktailSort(int[] array) {
     int n = 0;
     int m = array.length - 1;
     while (n <= m) {
          for (int i = n; i < m; i++) {
               if (array[ i ] > array[ i + 1 ] ) {
                    swapKeys( array , i , i + 1 );
               }
          }
          m--;
          for (int j = m; j > n; j--) {
               if (array[ j ] < array[ j - 1 ]) {
                    swapKeys( array , j , j - 1 );
               }
          }
          n++;
     }
}

public void swapKeys(int[] array, int i, int j) {
     int temp;
     temp = array[ i ];
     array[ i ] = array[ j ];
     array[ j ] = temp;
}