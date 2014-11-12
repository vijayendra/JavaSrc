package generic;

class List<E>{
    private E[] datastore;
    private int size;
    private int pos;

    public List(int numberElements){
        size = numberElements;
        pos = 0;
        datastore = (E[]) new Object[size];
    }

    public void add(E item){
        datastore[pos] = item;
        pos++;
    }

    public String toString(){
        String result = "";
        for(int i=0; i<pos; i++){
            result += datastore[i] + " ";
        }
        return result;
    }
}
