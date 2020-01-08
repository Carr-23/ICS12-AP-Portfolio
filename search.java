public int sequentialSearch(Object [ ] arr, Object value){
    for (int i = 0; i < arr.length ; i++){
        if (value.equals(arr [i]))
            return i;
    }
    return -1; 
}
