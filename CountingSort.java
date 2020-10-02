import java.util.*; 
  
public class Main  
{ 
  
    static void cSort(int[] arr)  
    { 
        int max = Arrays.stream(arr).max().getAsInt(); 
        int min = Arrays.stream(arr).min().getAsInt(); 
        int range = max - min + 1; 
        int c[] = new int[range]; 
        int output[] = new int[arr.length]; 
        for (int i = 0; i < arr.length; i++)  
        { 
            c[arr[i] - min]++; 
        } 
  
        for (int i = 1; i < c.length; i++) 
        { 
            c[i] += c[i - 1]; 
        }
        for (int i = arr.length - 1; i >= 0; i--)  
        { 
            output[c[arr[i] - min] - 1] = arr[i]; 
            c[arr[i] - min]--; 
        } 
  
        for (int i = 0; i < arr.length; i++) 
        { 
            arr[i] = output[i]; 
        } 
    } 
  
    static void display(int[] arr)  
    { 
        for (int i = 0; i < arr.length; i++)  
        { 
            System.out.print(arr[i] + " "); 
        } 
        System.out.println(""); 
    } 
        public static void main(String[] args) 
    { 
        int[] arr = {-4, -8, 0, -1, 8, 5, 1, 10}; 
        cSort(arr); 
        display(arr); 
    } 
}  
  
