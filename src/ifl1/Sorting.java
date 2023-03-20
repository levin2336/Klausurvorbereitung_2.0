package ifl1;

import abiturklassen.BinarySearchTree;
import abiturklassen.BinaryTree;
import abiturklassen.List;

public class Sorting {

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static List<Integer> sortingList(List<Integer> list){
        List<Integer> helpList = new List<>();
        while (!list.isEmpty()){
            list.toFirst();
            helpList.toFirst();
            int content = list.getContent();
            while (helpList.hasAccess() && content > helpList.getContent()){
                helpList.next();
            }
            if (helpList.hasAccess()){
                helpList.insert(content);
            }
            else {
                helpList.append(content);
            }
            list.remove();
        }
        return helpList;
    }

    public static void sortingArray(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void sortingArrayRecursive(int[] arr, int n){
        if (n <= 1){
            return;
        }
        sortingArrayRecursive(arr,n-1);

        int last = arr[n-1];
        int j = n-2;

        while (j>=0 && arr[j] > last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

    public static int returnSumOfTree(BinaryTree<Integer> tree){
        int sum = 0;
        if (tree.getContent() != null){
            System.out.println(tree.getContent());
            sum += tree.getContent();
        }
        if (!tree.getLeftTree().isEmpty()){
            sum += returnSumOfTree(tree.getLeftTree());
        }
        if (!tree.getRightTree().isEmpty()){
            sum += returnSumOfTree(tree.getRightTree());
        }
        return sum;
    }

    public static void searchForInt(BinarySearchTree<Zahl> tree, Zahl goal){
        Zahl con = tree.search(goal);
        if (con == null){
            System.out.println("Nicht Gefunden!");
            return;
        }
        System.out.println(con.getContent());
    }

    public static boolean searchForInt(BinaryTree<Integer> tree, int goal){
        boolean found = tree.getContent() == goal;

        if (!tree.getLeftTree().isEmpty() && searchForInt(tree.getLeftTree(),goal))
            found = true;

        if (!tree.getRightTree().isEmpty() && searchForInt(tree.getRightTree(),goal))
            found = true;

        return found;
    }


    public static void sortingArrayRecursive2(int[] arr, int n){
        if (n <= 1){
            return;
        }

        sortingArrayRecursive2(arr, n-1);

        int last = arr[n-1];
        int j = n-2;

        while (j >= 0 && arr[j] > last){
            arr[j+1] = arr[j];
            j--;
        }

        arr[j+1] = last;
    }
}
