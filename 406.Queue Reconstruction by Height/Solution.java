public class Solution {
    public int findMin(int init, int[][] array){
        int m = array.length;
        int min = -1;
        int index = init;
        for(int i = init; i < m; i++){
            if(array[i][1] == 0){
                if((min == -1)||(array[i][0] < min)){
                    index = i;
                    min = array[i][0];
                }
            }
        }
        return index;
    }
    
    public int[][] reconstructQueue(int[][] people) {
        int num = people.length;
        int [][] sorted = new int[num][];
        for(int i = 0; i < num; i++)
            sorted[i] = people[i].clone();
        int min = -1;
        int index = 0;
        int update = 0;
        for(int i = 0; i < num; i++){
            if(min >= 0) {
                for(int j = i; j < num; j++){
                    if(people[j][0] <= min) people[j][1]--;
                }
            }
            index = findMin(i,people);
            min = people[index][0];
            if(index != i){
                people[index] = people[i].clone();
                people[i] = sorted[index].clone();
                sorted[index] = sorted[i].clone();
                sorted[i] = people[i].clone();
            }
        }
        return sorted;
    }
}