/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aegisubtemplateeditor;

/**
 *
 * @author jaspertomas
 */
public class Dialogue {
    String startString="",endString="",data="";
    Integer start=0,end=0,duration=0;
    
    public Dialogue(String source)
    {
        String segments[]=source.split(",");
        String segments2[];
        startString=segments[1];
        endString=segments[2];
        if(segments.length>9)
            data=segments[9];
        segments=startString.split(":");
        //Dialogue: 0,0:28:33.50,0:28:33.90,Default,,0,0,0,, pó
        start=
            Integer.valueOf(segments[0])*60*60*100
            +Integer.valueOf(segments[1])*60*100
            +Integer.valueOf(segments[2].substring(0, 2))*100
            +Integer.valueOf(segments[2].substring(3, 5))
                ;
        segments=endString.split(":");
        //Dialogue: 0,0:28:33.50,0:28:33.90,Default,,0,0,0,, pó
        end=
            Integer.valueOf(segments[0])*60*60*100
            +Integer.valueOf(segments[1])*60*100
            +Integer.valueOf(segments[2].substring(0, 2))*100
            +Integer.valueOf(segments[2].substring(3, 5))
                ;
        duration=end-start;
    }
    
    private String recombine(Integer centis)
    {
        String hours="",minutes="",seconds="",centiseconds="";
        centiseconds=String.format("%02d",centis%100);
        centis-=centis%100;
        centis/=100;
        seconds=String.format("%02d",centis%60);
        centis-=centis%60;
        centis/=60;
        minutes=String.format("%02d",centis%60);
        centis-=centis%60;
        centis/=60;
        hours=String.format("%02d",centis);
        return hours+":"+minutes+":"+seconds+"."+centiseconds;
    }
    
    
    public String toString()
    {
            /*
0:14:44.80
0:17:49.85
*/
        int minutes=14-17;
        int seconds=44-49;
        int centiseconds=-5;
        int offset=(minutes*60*100)+(seconds*100)+centiseconds;
        return "Dialogue: 0,"+recombine(start-offset)+","+recombine(end-offset)+",Default,,0,0,0,,"+processdata();
    }
    public String processdata() {
        return data;
    }
    
    public String getStartString() {
        return startString;
    }

    public void setStartString(String startstring) {
        this.startString = startstring;
    }

    public String getEndString() {
        return endString;
    }

    public void setEndString(String endstring) {
        this.endString = endstring;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }
    
}
