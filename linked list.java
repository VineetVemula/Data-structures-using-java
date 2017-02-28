package ll.java;

import java.util.*;

class dynamicnode
{
    public Object info;
    public dynamicnode next;
    
    public dynamicnode(Object x, dynamicnode n)
    {
        info = x;
        next = n;
    }
    
    public Object getinfo()
    {
        return info;
    }
    
    public dynamicnode getnext()
    {
        return next;
    }
    
    public void setinfo(Object x)
    {
        info=x;
    }
    
    public void setnext(dynamicnode x)
    {
        next=x;
    }
}

class dynamiclist
{
    private dynamicnode list;
    
    public dynamiclist()
    {
        list=null;
    }
    
    public boolean isempty()
    {
        return list==null;
    }
    
    public void insertfirst(Object x)
    {
        dynamicnode q = new dynamicnode(x,null);
        if (!isempty()) 
        {
            q.setnext(list);
        } else {
        }
        list = q;
    }
    
    public void display()
    {
        dynamicnode p;
        p = list;
        while(p!=null)
        {
            System.out.print(p.info + " ");
            p=p.next;
        }
        System.out.print("\n");
    }
    
    public Object deletefirst()
    {
        if(isempty())
        {
            System.out.println("void deletion");
            System.exit(1);
        }
        Object temp = list.getinfo();
        if(list.getnext()==null)
        {
            list=null;
        }
        else
        {
            list = list.getnext();
        }
        return temp;
    }
}
public class LlJava {

    
    public static void main(String[] args) 
    {
        Scanner t = new Scanner(System.in);
        dynamiclist d = new dynamiclist();
        while(true)
        {
            System.out.println("enter choice 1.insertfirst 2.display 3.delete first 4.exit");
            int u=t.nextInt();
            switch(u)
            {
                case 1:
                {
                    Object v;
                    
                    System.out.println("enter number");
                    int n = t.nextInt();
                    v = n;
                    d.insertfirst(v);
                    break;
                }
                case 2:
                {
                    d.display();
                    break;
                }
                case 3:
                {
                    Object v;
                    v = d.deletefirst();
                    int n;
                n = (int) v;
                System.out.println(n+"is deleted");
                break;
                }
                case 4:
                {
                    return;
                }
           
            }
        }
    }
}
