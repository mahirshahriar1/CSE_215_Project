
package cse215Project;

import java.io.Serializable;


public class Staff extends User implements Serializable {
    
    Staff()
    {
        
    }
    Staff(int id, String password,String name) {
        super(id, password,name);
    }
    
}
