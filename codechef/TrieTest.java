import java.util.*;
class TrieTest {
 
    
 static class TrieNode 
{
    char content; 
    boolean isEnd; 
    int count;  
    LinkedList<TrieNode> childList; 
 
    /* Constructor */
    public TrieNode(char c)
    {
        childList = new LinkedList<TrieNode>();
        isEnd = false;
        content = c;
        count = 0;
    }  
    public TrieNode subNode(char c)
    {
        if (childList != null)
            for (TrieNode eachChild : childList)
                if (eachChild.content == c)
                    return eachChild;
        return null;
    }
}   
    
 static class Trie
{
     TrieNode root;
 
     /* Constructor */
    public Trie()
    {
        root = new TrieNode(' '); 
    }
     /* Function to insert word */
    public void insert(String word)
    {
        if (search(word) == true) 
            return;        
        TrieNode current = root; 
        for (char ch : word.toCharArray() )
        {
            TrieNode child = current.subNode(ch);
            if (child != null)
                current = child;
            else 
            {
                 current.childList.add(new TrieNode(ch));
                 current = current.subNode(ch);
            }
            current.count++;
        }
        current.isEnd = true;
    }
    /* Function to search for word */
    public boolean search(String word)
    {
        TrieNode current = root;  
        for (char ch : word.toCharArray() )
        {
            if (current.subNode(ch) == null)
                return false;
            else
                current = current.subNode(ch);
        }      
       /* if (current.isEnd == true) 
            return true;*/
        return true;
    }
    /* Function to remove a word */
    
}    
 
 
 
 
 public static void main(String[] args)
    {            
        Scanner in = new Scanner(System.in);
        /* Creating object of AATree */
        Trie  tree = new Trie();
        int t=in.nextInt();
        String h=in.nextLine();
        int i,j,k,p;
        String pos[]=new String[t];
        String neg[]=new String[t];
        String s="";
        i=0;j=0;
        for(p=0;p<t;p++)
        {
          s=in.nextLine();
          if(s.charAt(0)=='+')
              tree.insert(s.substring(2));
          else
              neg[j++]=s.substring(2);
        }
        TreeSet<String> set=new TreeSet<>();
        String rev="";
        int ch=0;
        for(i=0;i<j;i++)
        {
         rev=neg[i];
         for(k=1;k<=rev.length();k++)
         {
           if(tree.search(rev.substring(0,k))==false)
           {
            set.add(rev.substring(0,k)); break;   
           }
         }
         if(k==rev.length()+1) ch=1;
        }
        Iterator iterator;
   iterator = set.iterator();
   if(set.size()==0||ch==1) System.out.println("-1");
   else
   {
   System.out.println(set.size());
   while (iterator.hasNext()){
   System.out.println(iterator.next() + " ");
   }
   }
    }
    
}
