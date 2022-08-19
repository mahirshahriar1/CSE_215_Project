package cse215Project;

import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) throws Exception {
                       
              try{
                 // String str="com.jtattoo.plaf.texture.TextureLookAndFeel";
                  String str="com.jtattoo.plaf.noire.NoireLookAndFeel";
                             UIManager.setLookAndFeel(str);
              }catch(Exception e)
              {
                  e.printStackTrace();
              }
        MainLoginPage menu=new MainLoginPage();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
    }
    
}
