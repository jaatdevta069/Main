// //{ Driver Code Starts
// //Initial Template for J

// import java.io.*;
// import java.util.*;

// public class Drum {
//     public static void main (String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
//         while(t-->0){
//             int n = Integer.parseInt(br.readLine().trim());
//             int A[] = new int[n];
//             String inputLine[] = br.readLine().trim().split(" ");
//             for(int i=0; i<n; i++){
//                 A[i] = Integer.parseInt(inputLine[i]);
//             }
//             int p = 0;
//             for(int i=0; i<n-1; i++)
//                 p += Math.max(0,A[i+1]-A[i]);

//             Solution obj = new Solution();
//             ArrayList<ArrayList<Integer> > ans = obj.stockBuySell(A, n);
//             if(ans.size()==0)
//                 System.out.print("No Profit");
//             else{
                
//                 int c=0;
//                 for(int i=0; i<ans.size(); i++)
//                     c += A[ans.get(i).get(1)]-A[ans.get(i).get(0)];

//                 if(c==p)
//                     System.out.print(1);
//                 else
//                     System.out.print(0);
//             }System.out.println();
//         }
//     }
// }
// // } Driver Code Ends


// //User function Template for Java

// class Solution{
//     //Function to find the days of buying and selling stock for max profit.
//     ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
//         // code here
//         int pr=0,i=0,min=0;
//         ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//         ArrayList<Integer> l1= new ArrayList<>();
//             while(i<n){
//                 for (int j=i+1;j<n;j++){
//                 pr+=A[j]-A[j-1];
//                     if(A[i-1]>A[i] || pr ==0){
//                         i=j;
//                         break;
//                     }
//                 if(pr>min)
//                     min=pr;
//                 else {
//                     l1.add(i);
//                     l1.add(j);
//                     i=j;
//                     break;
//                 }
//             }}
//             list.add(l1);
//             return list;
//     }
// }
