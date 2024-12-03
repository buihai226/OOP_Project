/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dictionary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author dangt
 */
public class History {
    private int maxSize =1000; //lưu tối ta 1000 tìm kiếm trong history
    private LinkedList<String> historyList;
    public History(){
        historyList = new LinkedList<>(); // tạo list tìm kiếm.
    }
    // thêm lịch sử tìm kiếm
    public void addHistory(String x){
        historyList.add(x);
        while(historyList.size()>maxSize){
            historyList.removeFirst();
        }
     
        
    }

    public LinkedList<String> getHistoryList() {
        return historyList;
    }
    
}
