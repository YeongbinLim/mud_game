package asd;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class RP2_2013271099 extends JFrame {
    JPanel contentPane = new JPanel();
    JLabel la = new JLabel("P");//커서
    JLabel s1 = new JLabel("s");//시작
    JLabel boss_1 = new JLabel("1");//보스들
    JLabel boss_2 = new JLabel("2");
    JLabel boss_3 = new JLabel("3");
    JLabel boss_4 = new JLabel("4");
    JLabel o = new JLabel("|");//우측테두리
    JLabel o1 = new JLabel("|");
    JLabel o2 = new JLabel("|");
    JLabel o3 = new JLabel("|");
    JLabel o4 = new JLabel("|");
    JLabel o5 = new JLabel("|");
    JLabel o6 = new JLabel("|");
    JLabel o7 = new JLabel("|");
    JLabel o8 = new JLabel("|");
    JLabel o9 = new JLabel("|");
    JLabel o0 = new JLabel("|");
    JLabel o11 = new JLabel("|");
    JLabel o12 = new JLabel("|");
    JLabel o13 = new JLabel("|");
    JLabel o14 = new JLabel("|");
    JLabel o15 = new JLabel("|");
    JLabel o16 = new JLabel("|");
    JLabel o17 = new JLabel("|");
    JLabel o18 = new JLabel("|");
    JLabel o19 = new JLabel("|");
    JLabel o20 = new JLabel("|");
    JLabel o10 = new JLabel("|");
    JLabel o21 = new JLabel("|");
    JLabel o22 = new JLabel("|");
    JLabel o23 = new JLabel("|");
    JLabel o24 = new JLabel("|");
    JLabel o25 = new JLabel("|");
    JLabel o26 = new JLabel("|");
    JLabel oo = new JLabel("|");//좌측테두리
    JLabel o1o = new JLabel("|");
    JLabel o2o = new JLabel("|");
    JLabel o3o = new JLabel("|");
    JLabel o4o = new JLabel("|");
    JLabel o5o = new JLabel("|");
    JLabel o6o = new JLabel("|");
    JLabel o7o = new JLabel("|");
    JLabel o8o = new JLabel("|");
    JLabel o9o = new JLabel("|");
    JLabel o0o = new JLabel("|");
    JLabel o11o = new JLabel("|");
    JLabel o12o = new JLabel("|");
    JLabel o13o = new JLabel("|");
    JLabel o14o = new JLabel("|");
    JLabel o15o = new JLabel("|");
    JLabel o16o = new JLabel("|");
    JLabel o17o = new JLabel("|");
    JLabel o18o = new JLabel("|");
    JLabel o19o = new JLabel("|");
    JLabel o20o = new JLabel("|");
    JLabel o10o = new JLabel("|");
    JLabel o21o = new JLabel("|");
    JLabel o22o = new JLabel("|");
    JLabel o23o = new JLabel("|");
    JLabel o24o = new JLabel("|");
    JLabel o25o = new JLabel("|");
    JLabel o26o = new JLabel("|");
    JLabel bo = new JLabel("ㅁ");//벽    *더 할 수있지만 70개까지만 만들었습니다. 육안으로 길이 뜷림을 확인 할 수 있을 정도만 만들었습니다.
    JLabel bo1 = new JLabel("ㅁ");
    JLabel bo2 = new JLabel("ㅁ");
    JLabel bo3 = new JLabel("ㅁ");
    JLabel bo4 = new JLabel("ㅁ");
    JLabel bo5 = new JLabel("ㅁ");
    JLabel bo6 = new JLabel("ㅁ");
    JLabel bo7 = new JLabel("ㅁ");
    JLabel bo8 = new JLabel("ㅁ");
    JLabel bo9 = new JLabel("ㅁ");
    JLabel bo0 = new JLabel("ㅁ");
    JLabel bo11 = new JLabel("ㅁ");
    JLabel bo12 = new JLabel("ㅁ");
    JLabel bo13 = new JLabel("ㅁ");
    JLabel bo14 = new JLabel("ㅁ");
    JLabel bo15 = new JLabel("ㅁ");
    JLabel bo16 = new JLabel("ㅁ");
    JLabel bo17 = new JLabel("ㅁ");
    JLabel bo18 = new JLabel("ㅁ");
    JLabel bo19 = new JLabel("ㅁ");
    JLabel bo20 = new JLabel("ㅁ");
    JLabel bo10 = new JLabel("ㅁ");
    JLabel bo21 = new JLabel("ㅁ");
    JLabel bo22 = new JLabel("ㅁ");
    JLabel bo23 = new JLabel("ㅁ");
    JLabel bo24 = new JLabel("ㅁ");
    JLabel bo25 = new JLabel("ㅁ");
    JLabel bo26 = new JLabel("ㅁ");
    JLabel bo27 = new JLabel("ㅁ");
    JLabel bo28 = new JLabel("ㅁ");
    JLabel bo29 = new JLabel("ㅁ");
    JLabel bo30 = new JLabel("ㅁ");
    JLabel bo31 = new JLabel("ㅁ");
    JLabel bo32 = new JLabel("ㅁ");
    JLabel bo33 = new JLabel("ㅁ");
    JLabel bo34 = new JLabel("ㅁ");
    JLabel bo35 = new JLabel("ㅁ");
    JLabel bo36 = new JLabel("ㅁ");
    JLabel bo37 = new JLabel("ㅁ");
    JLabel bo38 = new JLabel("ㅁ");
    JLabel bo39 = new JLabel("ㅁ");
    JLabel bo40 = new JLabel("ㅁ");
    JLabel bo41 = new JLabel("ㅁ");
    JLabel bo42 = new JLabel("ㅁ");
    JLabel bo43 = new JLabel("ㅁ");
    JLabel bo44 = new JLabel("ㅁ");
    JLabel bo45 = new JLabel("ㅁ");
    JLabel bo46 = new JLabel("ㅁ");
    JLabel bo47 = new JLabel("ㅁ");
    JLabel bo48 = new JLabel("ㅁ");
    JLabel bo49 = new JLabel("ㅁ");
    JLabel bo50 = new JLabel("ㅁ");
    JLabel bo51 = new JLabel("ㅁ");
    JLabel bo52 = new JLabel("ㅁ");
    JLabel bo53 = new JLabel("ㅁ");
    JLabel bo54 = new JLabel("ㅁ");
    JLabel bo55 = new JLabel("ㅁ");
    JLabel bo56 = new JLabel("ㅁ");
    JLabel bo57 = new JLabel("ㅁ");
    JLabel bo58 = new JLabel("ㅁ");
    JLabel bo59 = new JLabel("ㅁ");
    JLabel bo60 = new JLabel("ㅁ");
    JLabel bo61 = new JLabel("ㅁ");
    JLabel bo62 = new JLabel("ㅁ");
    JLabel bo63 = new JLabel("ㅁ");
    JLabel bo64 = new JLabel("ㅁ");
    JLabel bo65 = new JLabel("ㅁ");
    JLabel bo66 = new JLabel("ㅁ");
    JLabel bo67 = new JLabel("ㅁ");
    JLabel bo68 = new JLabel("ㅁ");
    JLabel bo69 = new JLabel("ㅁ");
    JLabel bo70 = new JLabel("ㅁ");
    JLabel bo71 = new JLabel("ㅁ");
    JLabel Out = new JLabel("T");
    JLabel line = new JLabel("ㅡ");
    JLabel line2 = new JLabel("|");
    static final int[] wallnum2= new int[141]; //벽값을 넘기기위해 선언
    static int boss_1_x=0;
    static int boss_1_y=0;
    static int boss_1_1=2;//1번보스 야구게임 답
    static int boss_1_2=5;
    static int boss_1_3=3;
    static int boss_1_4=4;//for hard
    static int wall_1_x;
    static int wall_1_y;
    static int boss_2_x=0;
    static int boss_2_y=0;
    static int boss_2_1=9;//2번보스 야구게임 답
    static int boss_2_2=7;
    static int boss_2_3=2;
    static int boss_2_4=4;
    static int c=0;
    static int boss_3_x=0;
    static int boss_3_y=0;
    static int boss_3_1=5;//3번보스 야구게임 답
    static int boss_3_2=6;
    static int boss_3_3=7;
    static int boss_3_4=4;
    
    static int boss_4_x=0;
    static int boss_4_y=0;
    static int boss_4_1=2;//4번보스 야구게임 답
    static int boss_4_2=4;
    static int boss_4_3=5;
    static int boss_4_4=4;
    
    static int boss_1_count=0;
    static int boss_2_count=0;
    static int boss_3_count=0;
    static int boss_4_count=0;
    
    static int count_1=0;
    static int count_2=0;
    static int count_3=0;
    static int count_4=0;
    
    static int level=0;
    static int High_level=15;
    static int Out_x=0;//출구
    static int Out_y=0;
    Scanner scanner=new Scanner(System.in);
    final int FLYING_UNIT = 10;
    


    
    RP2_2013271099() {
        setTitle("과제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.addKeyListener(new MyKeyListener());
        la.setText("S");
        s1.setText("S");
        s1.setLocation(50,50);
        line.setText("-----------------------------------------------------------------------------");//테두리
        line.setLocation(0,0);
        line.setSize(310, 100);
        line2.setText("-----------------------------------------------------------------------------");//테두리
        line2.setLocation(0,200);
        line2.setSize(310, 100);
       
        la.setLocation(50, 50);
        la.setSize(100, 100);
        s1.setSize(100, 100);
      //o 는테두리
        o.setText("|");        o.setLocation(300, 10);        o.setSize(310, 100);
        o1.setText("|");        o1.setLocation(300, 30);        o1.setSize(310, 100);
        o3.setText("|");        o3.setLocation(300, 40);        o9.setSize(310, 100);
        o4.setText("|");        o4.setLocation(300, 50);        o8.setSize(310, 100);
        o5.setText("|");        o5.setLocation(300, 60);        o7.setSize(310, 100);
        o6.setText("|");        o6.setLocation(300, 70);        o6.setSize(310, 100);
        o7.setText("|");        o7.setLocation(300, 80);        o5.setSize(310, 100);
        o8.setText("|");        o9.setLocation(300, 90);        o4.setSize(310, 100);
        o9.setText("|");        o8.setLocation(300, 100);        o3.setSize(310, 100);
        o0.setText("|");        o10.setLocation(300, 110);        o0.setSize(310, 100);
        o10.setText("|");        o0.setLocation(300, 120);        o10.setSize(310, 100);
        o11.setText("|");        o11.setLocation(300, 130);        o11.setSize(310, 100);
        o12.setText("|");        o12.setLocation(300, 140);        o12.setSize(310, 100);
        o13.setText("|");        o13.setLocation(300, 150);        o13.setSize(310, 100);
        o14.setText("|");        o14.setLocation(300, 160);        o14.setSize(310, 100);
        o15.setText("|");        o15.setLocation(300, 170);        o15.setSize(310, 100);
        o16.setText("|");        o16.setLocation(300, 180);        o16.setSize(310, 100);
        o17.setText("|");        o17.setLocation(300, 190);        o17.setSize(310, 100);
        o18.setText("|");        o18.setLocation(300, 180);        o18.setSize(310, 100);
        o2.setText("|");        o2.setLocation(300, 20);        o2.setSize(310, 100);
        add(o);add(o2);add(o3);add(o4);add(o5);add(o6);add(o7);add(o8);add(o9);add(o0);add(o10);add(o11);add(o12);add(o13);
        add(o14);add(o15);add(o1);add(o17);add(o18);
        
        oo.setText("|");        oo.setLocation(0, 10);        oo.setSize(310, 100);
        o1o.setText("|");        o1o.setLocation(0, 30);        o1o.setSize(310, 100);
        o3o.setText("|");        o3o.setLocation(0, 40);        o9o.setSize(310, 100);
        o4o.setText("|");        o4o.setLocation(0, 50);        o8o.setSize(310, 100);
        o5o.setText("|");        o5o.setLocation(0, 60);        o7o.setSize(310, 100);
        o6o.setText("|");        o6o.setLocation(0, 70);        o6o.setSize(310, 100);
        o7o.setText("|");        o7o.setLocation(0, 80);        o5o.setSize(310, 100);
        o8o.setText("|");        o9o.setLocation(0, 90);        o4o.setSize(310, 100);
        o9o.setText("|");        o8o.setLocation(0, 100);        o3o.setSize(310, 100);
        o0o.setText("|");        o10o.setLocation(0, 110);        o0o.setSize(310, 100);
        o10o.setText("|");        o0o.setLocation(0, 120);        o10o.setSize(310, 100);
        o11o.setText("|");        o11o.setLocation(0, 130);        o11o.setSize(310, 100);
        o12o.setText("|");        o12o.setLocation(0, 140);        o12o.setSize(310, 100);
        o13o.setText("|");        o13o.setLocation(0, 150);        o13o.setSize(310, 100);
        o14o.setText("|");        o14o.setLocation(0, 160);        o14o.setSize(310, 100);
        o15o.setText("|");        o15o.setLocation(0, 170);        o15o.setSize(310, 100);
        o16o.setText("|");        o16o.setLocation(0, 180);        o16o.setSize(310, 100);
        o17o.setText("|");        o17o.setLocation(0, 190);        o17o.setSize(310, 100);
        o18o.setText("|");        o18o.setLocation(0, 180);        o18o.setSize(310, 100);
        o2o.setText("|");        o2o.setLocation(0, 20);        o2o.setSize(310, 100);
        add(oo);add(o2o);add(o3o);add(o4o);add(o5o);add(o6o);add(o7o);add(o8o);add(o9o);add(o0o);add(o10o);add(o11o);add(o12o);add(o13o);
        add(o14o);add(o15o);add(o1o);add(o17o);add(o18o);
        
        
        boss_1_x=((int)(Math.random()*28)+1)*10;//보스위치 랜덤
        boss_1_y=((int)(Math.random()*18)+1)*10;
       
        boss_2_x=((int)(Math.random()*28)+1)*10;
        boss_2_y=((int)(Math.random()*18)+1)*10;
    
        boss_3_x=((int)(Math.random()*28)+1)*10;
        boss_3_y=((int)(Math.random()*18)+1)*10;
    
        boss_4_x=((int)(Math.random()*28)+1)*10;
        boss_4_y=((int)(Math.random()*18)+1)*10;
        boss_1.setLocation(boss_1_x,boss_1_y);
        boss_1.setSize(310, 100);
        add(boss_1);
        boss_2.setLocation(boss_2_x,boss_2_y);
        boss_2.setSize(310, 100);
        add(boss_2);
        boss_3.setLocation(boss_3_x,boss_3_y);
        boss_3.setSize(310, 100);
        add(boss_3);
        boss_4.setLocation(boss_4_x,boss_4_y);
        boss_4.setSize(310, 100);
        add(boss_4);
        Out_x=((int)(Math.random()*28)+1)*10;
        Out_y=((int)(Math.random()*18)+1)*10;
        Out.setLocation(Out_x,Out_y);
        Out.setSize(310, 100);
        add(Out);
        contentPane.add(la);
        contentPane.add(s1);

        int wallnum[]=wall(50,boss_1_x,boss_2_x,boss_3_x,boss_4_x,Out_x,50,boss_1_y,boss_2_y,boss_3_y,boss_4_y,Out_y);
        
        //태그
        int cp;
        for(cp=0;cp<141;cp++) 
        {wallnum2[cp]=wallnum[cp];}
        
      //bo 는 벽의 위치                   
        bo19.setText("ㅁ");
        bo20.setText("ㅁ");
        bo21.setText("ㅁ");
        bo22.setText("ㅁ");
        bo23.setText("ㅁ");
        bo24.setText("ㅁ");
        bo25.setText("ㅁ");
        bo26.setText("ㅁ");
        bo27.setText("ㅁ");
        bo28.setText("ㅁ");
        bo29.setText("ㅁ");
        bo30.setText("ㅁ");
        bo31.setText("ㅁ");
        bo32.setText("ㅁ");
        bo33.setText("ㅁ");
        bo34.setText("ㅁ");
        bo35.setText("ㅁ");
        bo36.setText("ㅁ");
        bo37.setText("ㅁ");
        bo38.setText("ㅁ");
        bo39.setText("ㅁ");
        bo40.setText("ㅁ");
        bo41.setText("ㅁ");
        bo42.setText("ㅁ");
        bo43.setText("ㅁ");
        bo44.setText("ㅁ");
        bo45.setText("ㅁ");
        bo46.setText("ㅁ");
        bo47.setText("ㅁ");
        bo48.setText("ㅁ");
        bo49.setText("ㅁ");
        bo50.setText("ㅁ");
        bo51.setText("ㅁ");
        bo52.setText("ㅁ");
        bo53.setText("ㅁ");
        bo54.setText("ㅁ");
        bo55.setText("ㅁ");
        bo56.setText("ㅁ");
        bo57.setText("ㅁ");
        bo58.setText("ㅁ");
        bo59.setText("ㅁ");
        bo60.setText("ㅁ");
        bo61.setText("ㅁ");
        bo62.setText("ㅁ");
        bo63.setText("ㅁ");
        bo64.setText("ㅁ");
        bo65.setText("ㅁ");
        bo66.setText("ㅁ");
        bo67.setText("ㅁ");
        bo68.setText("ㅁ");
        bo69.setText("ㅁ");
        bo70.setText("ㅁ");
        bo71.setText("ㅁ");bo71.setLocation(wallnum[9],wallnum[79]);  bo71.setSize(300, 100);
        bo.setText("ㅁ");        bo.setLocation(wallnum[0],wallnum[70]);        bo.setSize(300, 100); 
        bo1.setText("ㅁ");        bo1.setLocation(wallnum[1],wallnum[71]);        bo1.setSize(300, 100);
        bo3.setText("ㅁ");        bo3.setLocation(wallnum[2],wallnum[72]);        bo9.setSize(300, 100);
        bo4.setText("ㅁ");        bo4.setLocation(wallnum[3],wallnum[73]);        bo8.setSize(300, 100);
        bo5.setText("ㅁ");        bo5.setLocation(wallnum[4],wallnum[74]);        bo7.setSize(300, 100);
        bo6.setText("ㅁ");        bo6.setLocation(wallnum[5],wallnum[75]);        bo6.setSize(300, 100);
        bo7.setText("ㅁ");        bo7.setLocation(wallnum[6],wallnum[76]);        bo5.setSize(300, 100);
        bo8.setText("ㅁ");        bo9.setLocation(wallnum[7],wallnum[77]);        bo4.setSize(300, 100);
        bo9.setText("ㅁ");        bo8.setLocation(wallnum[8],wallnum[78]);        bo3.setSize(300, 100);
        bo0.setText("ㅁ");        bo10.setLocation(wallnum[10],wallnum[80]);        bo0.setSize(300, 100);
        bo10.setText("ㅁ");       bo0.setLocation(wallnum[11],wallnum[81]);        bo10.setSize(300, 100);
        bo11.setText("ㅁ");       bo11.setLocation(wallnum[12],wallnum[82]);        bo11.setSize(300, 100);
        bo12.setText("ㅁ");       bo12.setLocation(wallnum[13],wallnum[83]);        bo12.setSize(300, 100);
        bo13.setText("ㅁ");       bo13.setLocation(wallnum[14],wallnum[84]);        bo13.setSize(300, 100);
        bo14.setText("ㅁ");       bo14.setLocation(wallnum[15],wallnum[85]);        bo14.setSize(300, 100);
        bo15.setText("ㅁ");       bo15.setLocation(wallnum[16],wallnum[86]);        bo15.setSize(300, 100);
        bo16.setText("ㅁ");        bo16.setLocation(wallnum[17],wallnum[87]);        bo16.setSize(300, 100);
        bo17.setText("ㅁ");        bo17.setLocation(wallnum[18],wallnum[88]);        bo17.setSize(300, 100);
        bo18.setText("ㅁ");        bo18.setLocation(wallnum[19],wallnum[89]);        bo18.setSize(300, 100);
        bo2.setText("ㅁ");        bo2.setLocation(wallnum[20], wallnum[90]);        bo2.setSize(300, 100);
        bo19.setLocation(wallnum[19],wallnum[89]);
        bo20.setLocation(wallnum[20],wallnum[90]);
        bo21.setLocation(wallnum[21],wallnum[91]);
        bo22.setLocation(wallnum[22],wallnum[92]);
        bo23.setLocation(wallnum[23],wallnum[93]);
        bo24.setLocation(wallnum[24],wallnum[94]);
        bo25.setLocation(wallnum[25],wallnum[95]);
        bo26.setLocation(wallnum[26],wallnum[96]);
        bo27.setLocation(wallnum[27],wallnum[97]);
        bo28.setLocation(wallnum[28],wallnum[98]);
        bo29.setLocation(wallnum[29],wallnum[99]);
        bo30.setLocation(wallnum[30],wallnum[100]);
        bo31.setLocation(wallnum[31],wallnum[101]);
        bo32.setLocation(wallnum[32],wallnum[102]);
        bo33.setLocation(wallnum[33],wallnum[103]);
        bo34.setLocation(wallnum[34],wallnum[104]);
        bo35.setLocation(wallnum[35],wallnum[105]);
        bo36.setLocation(wallnum[36],wallnum[106]);
        bo37.setLocation(wallnum[37],wallnum[107]);
        bo38.setLocation(wallnum[38],wallnum[108]);
        bo39.setLocation(wallnum[39],wallnum[109]);
        bo40.setLocation(wallnum[40],wallnum[110]);
        bo41.setLocation(wallnum[41],wallnum[111]);
        bo42.setLocation(wallnum[42],wallnum[112]);
        bo43.setLocation(wallnum[43],wallnum[113]);
        bo44.setLocation(wallnum[44],wallnum[114]);
        bo45.setLocation(wallnum[45],wallnum[115]);
        bo46.setLocation(wallnum[46],wallnum[116]);
        bo47.setLocation(wallnum[47],wallnum[117]);
        bo48.setLocation(wallnum[48],wallnum[118]);
        bo49.setLocation(wallnum[49],wallnum[119]);
        bo50.setLocation(wallnum[50],wallnum[120]);
        bo51.setLocation(wallnum[51],wallnum[121]);
        bo52.setLocation(wallnum[52],wallnum[122]);
        bo53.setLocation(wallnum[53],wallnum[123]);
        bo54.setLocation(wallnum[54],wallnum[124]);
        bo55.setLocation(wallnum[55],wallnum[125]);
        bo56.setLocation(wallnum[56],wallnum[126]);
        bo57.setLocation(wallnum[57],wallnum[127]);
        bo58.setLocation(wallnum[58],wallnum[128]);
        bo59.setLocation(wallnum[59],wallnum[129]);
        bo60.setLocation(wallnum[60],wallnum[130]);
        bo61.setLocation(wallnum[61],wallnum[131]);
        bo62.setLocation(wallnum[62],wallnum[132]);
        bo63.setLocation(wallnum[63],wallnum[133]);
        bo64.setLocation(wallnum[64],wallnum[134]);
        bo65.setLocation(wallnum[65],wallnum[135]);
        bo66.setLocation(wallnum[66],wallnum[136]);
        bo67.setLocation(wallnum[67],wallnum[137]);
        bo68.setLocation(wallnum[68],wallnum[138]);
        bo69.setLocation(wallnum[69],wallnum[139]);
        bo70.setLocation(wallnum[70],wallnum[140]);

        bo19.setSize(300,100);
        bo20.setSize(300,100);
        bo21.setSize(300,100);
        bo22.setSize(300,100);
        bo23.setSize(300,100);
        bo24.setSize(300,100);
        bo25.setSize(300,100);
        bo26.setSize(300,100);
        bo27.setSize(300,100);
        bo28.setSize(300,100);
        bo29.setSize(300,100);
        bo30.setSize(300,100);
        bo31.setSize(300,100);
        bo32.setSize(300,100);
        bo33.setSize(300,100);
        bo34.setSize(300,100);
        bo35.setSize(300,100);
        bo36.setSize(300,100);
        bo37.setSize(300,100);
        bo38.setSize(300,100);
        bo39.setSize(300,100);
        bo40.setSize(300,100);
        bo41.setSize(300,100);
        bo42.setSize(300,100);
        bo43.setSize(300,100);
        bo44.setSize(300,100);
        bo45.setSize(300,100);
        bo46.setSize(300,100);
        bo47.setSize(300,100);
        bo48.setSize(300,100);
        bo49.setSize(300,100);
        bo50.setSize(300,100);
        bo51.setSize(300,100);
        bo52.setSize(300,100);
        bo53.setSize(300,100);
        bo54.setSize(300,100);
        bo55.setSize(300,100);
        bo56.setSize(300,100);
        bo57.setSize(300,100);
        bo58.setSize(300,100);
        bo59.setSize(300,100);
        bo60.setSize(300,100);
        bo61.setSize(300,100);
        bo62.setSize(300,100);
        bo63.setSize(300,100);
        bo64.setSize(300,100);
        bo65.setSize(300,100);
        bo66.setSize(300,100);
        bo67.setSize(300,100);
        bo68.setSize(300,100);
        bo69.setSize(300,100);
        bo70.setSize(300,100);
        add(bo71);
        add(bo);
        add(bo2);
        add(bo3);
        add(bo4);
        add(bo5);
        add(bo6);
        add(bo7);
        add(bo8);
        add(bo9);
        add(bo0);
        add(bo10);
        add(bo11);
        add(bo12);
        add(bo13);
        add(bo14);
        add(bo15);
        add(bo1);
        add(bo17);
        add(bo18);
        add(bo19);
        add(bo20);
        add(bo21);
        add(bo22);
        add(bo23);
        add(bo24);
        add(bo25);
        add(bo26);
        add(bo27);
        add(bo28);
        add(bo29);
        add(bo30);
        add(bo31);
        add(bo32);
        add(bo33);
        add(bo34);
        add(bo35);
        add(bo36);
        add(bo37);
        add(bo38);
        add(bo39);
        add(bo40);
        add(bo41);
        add(bo42);
        add(bo43);
        add(bo44);
        add(bo45);
        add(bo46);
        add(bo47);
        add(bo48);
        add(bo49);
        add(bo50);
        add(bo51);
        add(bo52);
        add(bo53);
        add(bo54);
        add(bo55);
        add(bo56);
        add(bo57);
        add(bo58);
        add(bo59);
        add(bo60);
        add(bo61);
        add(bo62);
        add(bo63);
        add(bo64);
        add(bo65);
        add(bo66);
        add(bo67);
        add(bo68);
        add(bo69);
        add(bo70);

        add(line);
        add(line2);
        setSize(700, 700);
        setVisible(true);
        contentPane.requestFocus();
    }
    
	public  int[] wall(int x,int y,int z,int t,int q,int w,int e,int a,int c,int v,int n,int m)//벽만들기
    {
    	//시작점과 보스들의 위치와 탈출구 위치를 받아온다 
    	int tmp,x1,x2,x3,x4,x5,x6,y1,y2,y3,y4,y5,y6;
    	x1=x;
    	x2=y;int x22 = x2;//변수에 각각 위치를 저장한다
    	x3=z;int x33 = x3;
    	x4=t;int x44 = x4;
    	x5=q;int x55 = x5;
      	x6=w;int x66 = x6;
    	y1=e;
    	y2=a;int y22 = y2;
    	y3=c;int y33 = y3;
    	y4=v;int y44 = y4;
    	y5=n;int y55 = y5;
    	y6=m;int y66 = y6;
    	int wall_0_x=0;
    	int wall_0_y=0;
    	if(x1>x2)//시작점과 보스1의 x축위치를 비교 해서 큰 것을 x2에 배치한다. 이하 같다
    	{
    		tmp=x1;
    		x1=x2;
    		x2=tmp;
    	}
    	if(x22>x3)//보스1,보스2
    	{
    		tmp=x22;
    		x22=x3;
    		x3=tmp;
    	}
    	if(x33>x4)
    	{
    		tmp=x33;
    		x33=x4;
    		x4=tmp;
    	}
    	if(x44>x5)
    	{
    		tmp=x44;
    		x44=x5;
    		x5=tmp;
    	}
    	if(x55>x6)
    	{
    		tmp=x55;
    		x55=x6;
    		x6=tmp;
    	}
    	
    	int[] x_arr= new int[300];
    	int i,cnt_1=0;
    	int cnt_2=0;
    	int cnt_3=0;
    	int cnt_4=0;
    	int cnt_5=0;
    	int cnt_6=0;
    	int cnt_7=0;
    	int cnt_8=0;
    	int cnt_9=0;
    	int cnt_10=0;
    	
    	for(i=0;i<((x2-x1)/10)+1;i++)// ex) x2=210, x1=190 일때   값 190, 200, 210을 x_arr[i]에 저장한다. 이값에는 벽돌이 생기지 않는다     시작점과 보스1 사이의  모든x값들 
    	{
    		x_arr[i]=x1+(10*i);
    		cnt_1=i;//몇개의 값이 들어 갔는지 저장했다
    		
    	}
    	for(i=((x2-x1)/10)+1;i<(((x2-x1)/10)+1)+((x3-x22)/10)+1;i++)//보스1과 보스2 사이의  모든x값들  이하 같다
    	{
    		x_arr[i]=x22+(10*i);
    		cnt_2=i;
    	}
    	for(i=(((x2-x1)/10)+1)+((x3-x22)/10)+1;i<(((x2-x1)/10)+1)+((x3-x22)/10)+1+((x4-x33)/10)+1;i++)
    	{
    		x_arr[i]=x33+(10*i);
    		cnt_3=i;
    	}
    	for(i=(((x2-x1)/10)+1)+((x3-x22)/10)+1+((x4-x33)/10)+1;i<(((x2-x1)/10)+1)+((x3-x22)/10)+1+((x4-x33)/10)+1+((x5-x44)/10)+1;i++)
    	{
    		x_arr[i]=x44+(10*i);
    		cnt_4=i;
    	}
    	for(i=(((x2-x1)/10)+1)+((x3-x22)/10)+1+((x4-x33)/10)+1+((x5-x44)/10)+1;i<(((x2-x1)/10)+1)+((x3-x22)/10)+1+((x4-x33)/10)+1+((x5-x44)/10)+1+((x6-x55)/10)+1;i++)
    	{
    		x_arr[i]=x55+(10*i);
    		cnt_5=i;
    	}
    	
    	if(y1>y2)//시작점과 보스1의 y축위치를 비교 해서 큰 것을 x2에 배치한다. 이하 같다
    	{
    		tmp=y1;
    		y1=y2;
    		y2=tmp;
    	}
    	
    	if(y22>y3)
    	{
    		tmp=y22;
    		y22=y3;
    		y3=tmp;
    	}
    	if(y33>y4)
    	{
    		tmp=y33;
    		y33=y4;
    		y4=tmp;
    	}
    	if(y44>y5)
    	{
    		tmp=y44;
    		y44=y5;
    		y5=tmp;
    	}
    	if(y55>y6)
    	{
    		tmp=y55;
    		y55=y6;
    		y6=tmp;
    	}
    	
    	int[] y_arr= new int[300];//y값을 저장할 배열
    	
    	for(i=0;i<((y2-y1)/10)+1;i++)// ex) y2=210, y1=190 일때   값 190, 200, 210을 y_arr[i]에 저장한다. 이값에는 벽돌이 생기지 않는다     시작점과 보스1 사이의  모든y값들 
    	{
    		y_arr[i]=y1+(10*i);
    		cnt_6=i;
    	}
    	
    	for(i=((y2-y1)/10)+1;i<(((y2-y1)/10)+1)+((y3-y22)/10)+1;i++)//보스1과 보스2 사이의  모든y값들  이하 같다
    	{
    		y_arr[i]=y22+(10*i);
    		cnt_7=i;
    	}
    	for(i=(((y2-y1)/10)+1)+((y3-y22)/10)+1;i<(((y2-y1)/10)+1)+((y3-y22)/10)+1+((y4-y33)/10)+1;i++)
    	{
    		y_arr[i]=y33+(10*i);
    		cnt_8=i;
    	}
    	for(i=(((y2-y1)/10)+1)+((y3-y22)/10)+1+((y4-y33)/10)+1;i<(((y2-y1)/10)+1)+((y3-y22)/10)+1+((y4-y33)/10)+1+((y5-y44)/10)+1;i++)
    	{
    		y_arr[i]=y44+(10*i);
    		cnt_9=i;
    	}
    	for(i=(((y2-y1)/10)+1)+((y3-y22)/10)+1+((y4-y33)/10)+1+((y5-y44)/10)+1;i<(((y2-y1)/10)+1)+((y3-y22)/10)+1+((y4-y33)/10)+1+((y5-y44)/10)+1+((y6-y55)/10)+1;i++)
    	{
    		y_arr[i]=y55+(10*i);
    		cnt_10=i;
    	}
    	
    	int k=0;//while용
    	int p=0;//while문 카운터
    	int[] x_arr_1= new int[300];//벽의 x값이 path에 있을 수 있을때 1로 세트 
    	int[] x_arr_2= new int[300];//벽의 y값이 path에 있을 수 있을때 1로 세트
    	
    	Arrays.fill(x_arr_1,0);//배열값 0 초기화
    	int[] y_arr_1= new int[300];
    	Arrays.fill(y_arr_1,0);//배열값 0 초기화
    	int j;//for구문용
    	int judge=0;//겹쳤는지 판단용
    	
    	while(k==0) {
    	wall_0_x=((int)(Math.random()*28)+1)*10;//랜덤으로 x축 벽값받음
    	wall_0_y=((int)(Math.random()*18)+1)*10;//랜덤으로 y축 벽값받음
    	judge=0;
    	Arrays.fill(x_arr_1,0);
    	Arrays.fill(y_arr_1,0);
    	for(i=0;i<cnt_1+1;i++)
    	{
    		if(wall_0_x==x_arr[i])
    		{
    			x_arr_1[i]=1;//벽의 x값이 path에 있을 수 있을때 1로 세트       시작점과 보스1사이
    		}
    	}
    	for(i=0;i<cnt_6+1;i++)
    	{
    		if(wall_0_y==y_arr[i])
    		{
    			y_arr_1[i]=1;//벽의 y값이 path에 있을 수 있을때 1로 세트
    		}
    	}
    	
    	for(i=0;i<cnt_1+1;i++)
    	{
    		for(j=0;j<cnt_6+1;j++)
    		{
    			if(y_arr_1[j]+x_arr_1[i]==2)//path의 x와 y값이 벽의 x와y값과 같으면 2로 세트한다.   *path= 바로 다음 보스와의 길이다.
    				judge=1;//겹쳣다고 판단
    		}
    	}if(judge==1)
    		continue;//  벽의 x,y값을 다시 받으로 올라간다 
    	for(i=cnt_1+1;i<cnt_2+1;i++)
    	{
    		if(wall_0_x==x_arr[i])
    		{
    			x_arr_1[i]=1;//                                      보스1과 보스2사이
    		}
    	}
    	for(i=cnt_6+1;i<cnt_7+1;i++)
    	{
    		if(wall_0_y==y_arr[i])
    		{
    			y_arr_1[i]=1;
    		}
    	}
    	
    	for(i=cnt_1+1;i<cnt_2+1;i++)
    	{
    		for(j=cnt_6+1;j<cnt_7+1;j++)
    		{
    			if(y_arr_1[j]+x_arr_1[i]==2)
    				judge=1;
    		}
    	}if(judge==1)
    		continue;
    	for(i=cnt_2+1;i<cnt_3+1;i++)
    	{
    		if(wall_0_x==x_arr[i])
    		{
    			x_arr_1[i]=1;//                                          보스1과 보스2사이
    		}
    	}
    	for(i=cnt_7+1;i<cnt_8+1;i++)
    	{
    		if(wall_0_y==y_arr[i])
    		{
    			y_arr_1[i]=1;
    		}
    	}
    	
    	for(i=cnt_2+1;i<cnt_3+1;i++)
    	{
    		for(j=cnt_7+1;j<cnt_8+1;j++)
    		{
    			if(y_arr_1[j]+x_arr_1[i]==2)
    				judge=1;
    		}
    	}if(judge==1)
    		continue;
    	for(i=cnt_3+1;i<cnt_4+1;i++)
    	{
    		if(wall_0_x==x_arr[i])
    		{
    			x_arr_1[i]=1;
    		}
    	}
    	for(i=cnt_8+1;i<cnt_9+1;i++)
    	{
    		if(wall_0_y==y_arr[i])
    		{
    			y_arr_1[i]=1;
    		}
    	}
    	
    	for(i=cnt_3+1;i<cnt_4+1;i++)
    	{
    		for(j=cnt_8+1;j<cnt_9+1;j++)
    		{
    			if(y_arr_1[j]+x_arr_1[i]==2)
    				judge=1;
    		}
    	}if(judge==1)
    		continue;
    	for(i=cnt_4+1;i<cnt_5+1;i++)
    	{
    		if(wall_0_x==x_arr[i])
    		{
    			x_arr_1[i]=1;
    		}
    	}
    	for(i=cnt_9+1;i<cnt_10+1;i++)
    	{
    		if(wall_0_y==y_arr[i])
    		{
    			y_arr_1[i]=1;
    		}
    	}
    	
    	for(i=cnt_4+1;i<cnt_5+1;i++)
    	{
    		for(j=cnt_9+1;j<cnt_10+1;j++)
    		{
    			if(y_arr_1[j]+x_arr_1[i]==2)
    				judge=1;
    		}
    	}
    	if(wall_0_x==x)// 벽의 x,y값이 시작점,보스들,탈출구의 위치와 겹치지 않게 하기
    		judge=1;
    	if(wall_0_x==z)
    		judge=1;
    	if(wall_0_x==t)
    		judge=1;
    	if(wall_0_x==q)
    		judge=1;
    	if(wall_0_x==w)
    		judge=1;
    	if(wall_0_y==e)
    		judge=1;
    	if(wall_0_y==a)
    		judge=1;
    	if(wall_0_y==c)
    		judge=1;
    	if(wall_0_y==v)
    		judge=1;
    	if(wall_0_y==n)
    		judge=1;
    	if(wall_0_y==m)
    		judge=1;
    	
    	if(judge==1)
    		continue;

    	x_arr_2[p+70]=wall_0_y;//70이상에는 y값을 입력
    	x_arr_2[p]=wall_0_x;//70이하 값에는 x값을 입력
    	
    	p++;
    	if(p>70) 
    		break;
    	
    }
    	return x_arr_2;//배열리턴
}
    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
        	
            int keyCode = e.getKeyCode();
            Scanner s=new Scanner(System.in);
            int count_11=0;// 중복되는 벽이 있을때 동서남북 방향표시 중복 방지를 위해
            int count_12=0;
            int count_13=0;
            int count_14=0;
            switch (keyCode) {
            case KeyEvent.VK_UP://위 방향키일때
                la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
                la.setText("P");
                int a,b;
               int cn;
                a=la.getY();
                b=la.getX();

                System.out.println("\n");
                System.out.println("("+b+", "+a+")");
                
                if(a==0) {
                	la.setLocation(la.getX(), la.getY() +10);
                	System.out.print("이동불가");}//테두리를 넘어가지 못한다
               for(cn=0;cn<71;cn++)
            	   if(b==wallnum2[cn]&&a==wallnum2[cn+70]) {
                   	la.setLocation(la.getX(), la.getY() +10);
                   	System.out.print("이동불가");//벽을 넘어가지 못한다
                   	break;}
               if(a+10==200) {
            		 System.out.print("남쪽 막힘 ");
            	 }
              if(a-10==0) {
          		 System.out.print("북쪽 막힘 ");
          	 }
            if(b+10==300) {
         		 System.out.print("동쪽 막힘 ");
         	 }
           if(b-10==0) {
        		 System.out.print("서쪽 막힘 ");
        	 }
            count_11=0;
            count_12=0;
            count_13=0;
            count_14=0;
               for(cn=0;cn<71;cn++) {
              	 if(b+10==wallnum2[cn]&&a==wallnum2[cn+70]&&count_1==0) {
              		 System.out.print("동쪽 막힘 ");
              		 count_11=1;
              	 }
              	 if(b-10==wallnum2[cn]&&a==wallnum2[cn+70]&&count_2==0) {
              		 System.out.print("서쪽 막힘 ");
              		 count_12=1;
              	 }
              	 if(b==wallnum2[cn]&&a+10==wallnum2[cn+70]&&count_3==0) {
              		 System.out.print("남쪽 막힘 ");
              		 count_13=1;
              	 }
              	 if(b==wallnum2[cn]&&a-10==wallnum2[cn+70]&&count_4==0) {
              		 System.out.print("북쪽 막힘 ");
              		 count_14=1;
              	 }}
                if(boss_1_x==b&&boss_1_y==a&&count_1==0)//보스1을 클리어 하지 않았을 시
                {
                	if(level==0) {//4자리수 게임으로
                    	Baseball_highlevel(boss_1_1,boss_1_2,boss_1_3,boss_1_4);
                    	count_1=1;
                	}
                	else {//3자리수 게임으로
                	Baseball(boss_1_1,boss_1_2,boss_1_3,level);}
                	count_1=1;
                }
                
                else if(boss_1_x==b&&boss_1_y==a&&count_1==1) {
                	System.out.print("이미 1번보스는 클리어 하셨습니다.");
                }
                //1번보스 끝
                if(boss_2_x==b&&boss_2_y==a&&count_1==1&&count_2==0)//보스1을 클리어하고 보스2는 클리어하지 않았을시
                {
                	if(level==0) {
                		Baseball_highlevel(boss_2_1,boss_2_2,boss_2_3,boss_2_4);
                		count_2=1;
                	}
                	else {
                	Baseball(boss_2_1,boss_2_2,boss_2_3,level);}
                	count_2=1;
                }
               	else if(boss_2_x==b&&boss_2_y==a&&count_1==0) {
                		System.out.print("1번보스를 잡고 오세요");
                	}
               	else if(boss_2_x==b&&boss_2_y==a&&count_1==1&&count_2==1) {
                		System.out.print("이미 2번보스는 클리어 하셨습니다");
                	}
                	//2번보스 끝
                if(boss_3_x==b&&boss_3_y==a&&count_1==1&&count_2==1&&count_3==0)//보스1,보스2를 클리어하고 보스3은 클리어하지 않았을시
                {
                	if(level==0) {
                		Baseball_highlevel(boss_3_1,boss_3_2,boss_3_3,boss_3_4);
                    	count_3=1;
                	}
                	else {
                	Baseball(boss_3_1,boss_3_2,boss_3_3,level);}
                	count_3=1;
                }
                else if(boss_3_x==b&&boss_3_y==a&&count_1==0) {
                		System.out.print("1번보스를 잡고 오세요");
                	}
               	else if(boss_3_x==b&&boss_3_y==a&&count_2==00&&count_1==1) {
                		System.out.print("2번보스를 잡고 오세요");
                	}
               	else if(boss_3_x==b&&boss_3_y==a&&count_1==1&&count_2==1&&count_3==1) {
                		System.out.print("이미 3번보스는 클리어 하셨습니다");
                	}
                	//3번보스 끝
                if(boss_4_x==b&&boss_4_y==a&&count_1==1&&count_2==1&&count_3==1&&count_4==0)//보스1,보스2,보스3을 클리어하고 보스4는 클리어하지 않았을시
                {
                	if(level==0) {
                		Baseball_highlevel(boss_4_1,boss_4_2,boss_4_3,boss_4_4);
                		count_4=1;
                	}
                	else {
                	Baseball(boss_4_1,boss_4_2,boss_4_3,level);}
                	count_4=1;
                }
                else if(boss_4_x==b&&boss_4_y==a&&count_1==0) {
                		System.out.print("1번보스를 잡고 오세요");
                	}
               	else if(boss_4_x==b&&boss_4_y==a&&count_2==0&&count_1==1) {
                		System.out.print("2번보스를 잡고 오세요");
                	}
               	else if(boss_4_x==b&&boss_4_y==a&&count_2==1&&count_1==10&&count_3==0) {
            		System.out.print("3번보스를 잡고 오세요");
            	}
               	else if(boss_4_x==b&&boss_4_y==a&&count_1==1&&count_2==1&&count_4==1&&count_3==1) {
                		System.out.print("모든 보스를 클리어 하셨습니다 T로 나가 주세요");
                	}//4번보스 끝
               	if(Out_x==b&&Out_y==a&&count_1==1&&count_2==1&&count_4==1&&count_3==1)//모든보스 클리어시
               	{
               		System.out.print("당신은 승리했습니다. 다시 하시려면 1을 눌러주세요 종료하시려면 0을 눌러주세요");
               		c=scanner.nextInt();
               		
               		setVisible(false);
               		dispose();//gui끄기
               		if(c==1)
               			loginSignal.countDown();//래치를 0으로 돌려 재시작한다
               		if(c==0)
               			System.exit(0) ;
               	}
               	else if(Out_x==b&&Out_y==a&&count_1==0) {
            		System.out.print("1번보스를 잡고 오세요");
            	}
           	else if(Out_x==b&&Out_y==a&&count_2==0&&count_1==1) {
            		System.out.print("2번보스를 잡고 오세요");
            	}
           	else if(Out_x==b&&Out_y==a&&count_2==1&&count_1==10&&count_3==0) {
        		System.out.print("3번보스를 잡고 오세요");
        	}
           	else if(Out_x==b&&Out_y==a&&count_1==1&&count_2==1&&count_4==0&&count_3==1) {
            		System.out.print("4번보스를 잡고 오세요");
            	}
                break;
            case KeyEvent.VK_DOWN://아래 방향키일때
                la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
                la.setText("P");
                a=la.getY();
                b=la.getX();

                System.out.println("\n");
                System.out.println("("+b+", "+a+")");
                if(a==200) {
                	la.setLocation(la.getX(), la.getY() -10);
                	System.out.print("이동불가");}
                for(cn=0;cn<71;cn++)
             	   if(b==wallnum2[cn]&&a==wallnum2[cn+70]) {
                    	la.setLocation(la.getX(), la.getY() -10);
                    	System.out.print("이동불가");
                    	break;}
                if(a+10==200) {
              		 System.out.print("남쪽 막힘 ");
              	 }
                if(a-10==0) {
            		 System.out.print("북쪽 막힘 ");
            	 }
              if(b+10==300) {
           		 System.out.print("동쪽 막힘 ");
           	 }
             if(b-10==0) {
          		 System.out.print("서쪽 막힘 ");
          	 }
             count_11=0;
             count_12=0;
             count_13=0;
             count_14=0;
                 for(cn=0;cn<71;cn++) {
                	 if(b+10==wallnum2[cn]&&a==wallnum2[cn+70]&&count_1==0) {
                		 System.out.print("동쪽 막힘 ");
                		 count_11=1;
                	 }
                	 if(b-10==wallnum2[cn]&&a==wallnum2[cn+70]&&count_2==0) {
                		 System.out.print("서쪽 막힘 ");
                		 count_12=1;
                	 }
                	 if(b==wallnum2[cn]&&a+10==wallnum2[cn+70]&&count_3==0) {
                		 System.out.print("남쪽 막힘 ");
                		 count_13=1;
                	 }
                	 if(b==wallnum2[cn]&&a-10==wallnum2[cn+70]&&count_4==0) {
                		 System.out.print("북쪽 막힘 ");
                		 count_14=1;
                	 }}
                if(boss_1_x==b&&boss_1_y==a&&count_1==0)
                {
                	if(level==0) {
                    	Baseball_highlevel(boss_1_1,boss_1_2,boss_1_3,boss_1_4);
                    	count_1=1;
                	}
                	else {
                	Baseball(boss_1_1,boss_1_2,boss_1_3,level);}
                	count_1=1;
                }
                
                else if(boss_1_x==b&&boss_1_y==a&&count_1==1) {
                	System.out.print("이미 1번보스는 클리어 하셨습니다.");
                }
                //1번보스 끝
                if(boss_2_x==b&&boss_2_y==a&&count_1==1&&count_2==0)
                {
                	if(level==0) {
                		Baseball_highlevel(boss_2_1,boss_2_2,boss_2_3,boss_2_4);
                		count_2=1;
                	}
                	else {
                	Baseball(boss_2_1,boss_2_2,boss_2_3,level);}
                	count_2=1;
                }
               	else if(boss_2_x==b&&boss_2_y==a&&count_1==0) {
                		System.out.print("1번보스를 잡고 오세요");
                	}
               	else if(boss_2_x==b&&boss_2_y==a&&count_1==1&&count_2==1) {
                		System.out.print("이미 2번보스는 클리어 하셨습니다");
                	}
                	//2번보스 끝
                if(boss_3_x==b&&boss_3_y==a&&count_1==1&&count_2==1&&count_3==0)
                {
                	if(level==0) {
                		Baseball_highlevel(boss_3_1,boss_3_2,boss_3_3,boss_3_4);
                		count_3=1;
                	}
                	else {
                	Baseball(boss_3_1,boss_3_2,boss_3_3,level);}
                	count_3=1;
                }
                else if(boss_3_x==b&&boss_3_y==a&&count_1==0) {
                		System.out.print("1번보스를 잡고 오세요");
                	}
               	else if(boss_3_x==b&&boss_3_y==a&&count_2==00&&count_1==1) {
                		System.out.print("2번보스를 잡고 오세요");
                	}
               	else if(boss_3_x==b&&boss_3_y==a&&count_1==1&&count_2==1&&count_3==1) {
                		System.out.print("이미 3번보스는 클리어 하셨습니다");
                	}
                	//3번보스 끝
                if(boss_4_x==b&&boss_4_y==a&&count_1==1&&count_2==1&&count_3==1&&count_4==0)
                {
                	if(level==0) {
                		Baseball_highlevel(boss_4_1,boss_4_2,boss_4_3,boss_4_4);
                		count_4=1;
                	}
                	else {
                	Baseball(boss_4_1,boss_4_2,boss_4_3,level);}
                	count_4=1;
                }
                else if(boss_4_x==b&&boss_4_y==a&&count_1==0) {
                		System.out.print("1번보스를 잡고 오세요");
                	}
               	else if(boss_4_x==b&&boss_4_y==a&&count_2==0&&count_1==1) {
                		System.out.print("2번보스를 잡고 오세요");
                	}
               	else if(boss_4_x==b&&boss_4_y==a&&count_2==1&&count_1==10&&count_3==0) {
            		System.out.print("3번보스를 잡고 오세요");
            	}
               	else if(boss_4_x==b&&boss_4_y==a&&count_1==1&&count_2==1&&count_4==1&&count_3==1) {
                		System.out.print("모든 보스를 클리어 하셨습니다 T로 나가 주세요");
                	}//4번보스 끝
               	if(Out_x==b&&Out_y==a&&count_1==1&&count_2==1&&count_4==1&&count_3==1)
               	{

               		System.out.print("당신은 승리했습니다. 다시 하시려면 1을 눌러주세요 종료하시려면 0을 눌러주세요");
               		c=scanner.nextInt();
               		
               		setVisible(false);
               		dispose();//gui끄기
               		if(c==1)
               			loginSignal.countDown();//래치를 0으로 돌려 
               		if(c==0)
               			System.exit(0) ;
               	}
               	else if(Out_x==b&&Out_y==a&&count_1==0) {
            		System.out.print("1번보스를 잡고 오세요");
            	}
           	else if(Out_x==b&&Out_y==a&&count_2==0&&count_1==1) {
            		System.out.print("2번보스를 잡고 오세요");
            	}
           	else if(Out_x==b&&Out_y==a&&count_2==1&&count_1==10&&count_3==0) {
        		System.out.print("3번보스를 잡고 오세요");
        	}
           	else if(Out_x==b&&Out_y==a&&count_1==1&&count_2==1&&count_4==0&&count_3==1) {
            		System.out.print("4번보스를 잡고 오세요");
            	}
                break;
            case KeyEvent.VK_LEFT://좌방향키일때
                la.setLocation(la.getX() - FLYING_UNIT, la.getY());
                la.setText("P");
                a=la.getY();
                b=la.getX();

                System.out.println("\n");
                System.out.println("("+b+", "+a+")");
                if(b==0) {
                	la.setLocation(la.getX() +10, la.getY());
                	System.out.print("이동불가");}
                for(cn=0;cn<71;cn++)
             	   if(b==wallnum2[cn]&&a==wallnum2[cn+70]) {
                    	la.setLocation(la.getX()+10, la.getY() );
                    	System.out.print("이동불가");
                    	break;}
                if(a+10==200) {
             		 System.out.print("남쪽 막힘 ");
             	 }
               if(a-10==0) {
           		 System.out.print("북쪽 막힘 ");
           	 }
             if(b+10==300) {
          		 System.out.print("동쪽 막힘 ");
          	 }
            if(b-10==0) {
         		 System.out.print("서쪽 막힘 ");
         	 }
           count_11=0;
           count_12=0;
           count_13=0;
           count_14=0;
                for(cn=0;cn<71;cn++) {
               	 if(b+10==wallnum2[cn]&&a==wallnum2[cn+70]&&count_1==0) {
               		 System.out.print("동쪽 막힘 ");
               		 count_11=1;
               	 }
               	 if(b-10==wallnum2[cn]&&a==wallnum2[cn+70]&&count_2==0) {
               		 System.out.print("서쪽 막힘 ");
               		 count_12=1;
               	 }
               	 if(b==wallnum2[cn]&&a+10==wallnum2[cn+70]&&count_3==0) {
               		 System.out.print("남쪽 막힘 ");
               		 count_13=1;
               	 }
               	 if(b==wallnum2[cn]&&a-10==wallnum2[cn+70]&&count_4==0) {
               		 System.out.print("북쪽 막힘 ");
               		 count_14=1;
               	 }}
                if(boss_1_x==b&&boss_1_y==a&&count_1==0)
                {
                	if(level==0) {
                    	Baseball_highlevel(boss_1_1,boss_1_2,boss_1_3,boss_1_4);
                    	count_1=1;
                	}
                	else {
                	Baseball(boss_1_1,boss_1_2,boss_1_3,level);}
                	count_1=1;
                }
                else if(boss_1_x==b&&boss_1_y==a&&count_1==1) {
                	System.out.print("이미 1번보스는 클리어 하셨습니다.");
                }
                //1번보스 끝
                if(boss_2_x==b&&boss_2_y==a&&count_1==1&&count_2==0)
                {
                	if(level==0) {
                		Baseball_highlevel(boss_2_1,boss_2_2,boss_2_3,boss_2_4);
                		count_2=1;
                	}
                	else {
                	Baseball(boss_2_1,boss_2_2,boss_2_3,level);}
                	count_2=1;
                }
               	else if(boss_2_x==b&&boss_2_y==a&&count_1==0) {
                		System.out.print("1번보스를 잡고 오세요");
                	}
               	else if(boss_2_x==b&&boss_2_y==a&&count_1==1&&count_2==1) {
                		System.out.print("이미 2번보스는 클리어 하셨습니다");
                	}
                	//2번보스 끝
                if(boss_3_x==b&&boss_3_y==a&&count_1==1&&count_2==1&&count_3==0)
                {
                	if(level==0) {
                		Baseball_highlevel(boss_3_1,boss_3_2,boss_3_3,boss_3_4);
                		count_3=1;
                	}
                	else {
                	Baseball(boss_3_1,boss_3_2,boss_3_3,level);}
                	count_3=1;
                }
                else if(boss_3_x==b&&boss_3_y==a&&count_1==0) {
                		System.out.print("1번보스를 잡고 오세요");
                	}
               	else if(boss_3_x==b&&boss_3_y==a&&count_2==00&&count_1==1) {
                		System.out.print("2번보스를 잡고 오세요");
                	}
               	else if(boss_3_x==b&&boss_3_y==a&&count_1==1&&count_2==1&&count_3==1) {
                		System.out.print("이미 3번보스는 클리어 하셨습니다");
                	}
                	//3번보스 끝
                if(boss_4_x==b&&boss_4_y==a&&count_1==1&&count_2==1&&count_3==1&&count_4==0)
                {
                	if(level==0) {
                		Baseball_highlevel(boss_4_1,boss_4_2,boss_4_3,boss_4_4);
                		count_4=1;
                	}
                	else {
                	Baseball(boss_4_1,boss_4_2,boss_4_3,level);}
                	count_4=1;
                }
                else if(boss_4_x==b&&boss_4_y==a&&count_1==0) {
                		System.out.print("1번보스를 잡고 오세요");
                	}
               	else if(boss_4_x==b&&boss_4_y==a&&count_2==0&&count_1==1) {
                		System.out.print("2번보스를 잡고 오세요");
                	}
               	else if(boss_4_x==b&&boss_4_y==a&&count_2==1&&count_1==10&&count_3==0) {
            		System.out.print("3번보스를 잡고 오세요");
            	}
               	else if(boss_4_x==b&&boss_4_y==a&&count_1==1&&count_2==1&&count_4==1&&count_3==1) {
                		System.out.print("모든 보스를 클리어 하셨습니다 T로 나가 주세요");
                	}//4번보스 끝
               	if(Out_x==b&&Out_y==a&&count_1==1&&count_2==1&&count_4==1&&count_3==1)
               	{
               		System.out.print("당신은 승리했습니다. 다시 하시려면 1을 눌러주세요 종료하시려면 0을 눌러주세요");
               		c=scanner.nextInt();
               		
               		setVisible(false);
               		dispose();//gui끄기
               		if(c==1)
               			loginSignal.countDown();//래치를 0으로 돌려 
               		if(c==0)
               			System.exit(0) ;
               	}
               	else if(Out_x==b&&Out_y==a&&count_1==0) {
            		System.out.print("1번보스를 잡고 오세요");
            	}
           	else if(Out_x==b&&Out_y==a&&count_2==0&&count_1==1) {
            		System.out.print("2번보스를 잡고 오세요");
            	}
           	else if(Out_x==b&&Out_y==a&&count_2==1&&count_1==10&&count_3==0) {
        		System.out.print("3번보스를 잡고 오세요");
        	}
           	else if(Out_x==b&&Out_y==a&&count_1==1&&count_2==1&&count_4==0&&count_3==1) {
            		System.out.print("4번보스를 잡고 오세요");
            	}
                break;
            case KeyEvent.VK_RIGHT://우방향키일때
                la.setLocation(la.getX() + FLYING_UNIT, la.getY());
                la.setText("P");
                a=la.getY();
                b=la.getX();
                System.out.println("\n");
                System.out.println("("+b+", "+a+")");
                if(b==300) {
                	la.setLocation(la.getX() -10, la.getY());
                	System.out.print("이동불가");}
                for(cn=0;cn<71;cn++)
             	   if(b==wallnum2[cn]&&a==wallnum2[cn+70]) {
                    	la.setLocation(la.getX()-10, la.getY());
                    	System.out.print("이동불가");
                    	break;}
                if(a+10==200) {
             		 System.out.print("남쪽 막힘 ");
             	 }
               if(a-10==0) {
           		 System.out.print("북쪽 막힘 ");
           	 }
             if(b+10==300) {
          		 System.out.print("동쪽 막힘 ");
          	 }
            if(b-10==0) {
         		 System.out.print("서쪽 막힘 ");
         	 }
             count_11=0;
             count_12=0;
             count_13=0;
             count_14=0;
                for(cn=0;cn<71;cn++) {
               	 if(b+10==wallnum2[cn]&&a==wallnum2[cn+70]&&count_1==0) {
               		 System.out.print("동쪽 막힘 ");
               		 count_11=1;
               	 }
               	 if(b-10==wallnum2[cn]&&a==wallnum2[cn+70]&&count_2==0) {
               		 System.out.print("서쪽 막힘 ");
               		 count_12=1;
               	 }
               	 if(b==wallnum2[cn]&&a+10==wallnum2[cn+70]&&count_3==0) {
               		 System.out.print("남쪽 막힘 ");
               		 count_13=1;
               	 }
               	 if(b==wallnum2[cn]&&a-10==wallnum2[cn+70]&&count_4==0) {
               		 System.out.print("북쪽 막힘 ");
               		 count_14=1;
               	 }}
                if(boss_1_x==b&&boss_1_y==a&&count_1==0)
                {
                	if(level==0) {
                    	Baseball_highlevel(boss_1_1,boss_1_2,boss_1_3,boss_1_4);
                       	count_1=1;
                	}
                	else {
                	Baseball(boss_1_1,boss_1_2,boss_1_3,level);}
                	count_1=1;
                }
                
                else if(boss_1_x==b&&boss_1_y==a&&count_1==1) {
                	System.out.print("이미 1번보스는 클리어 하셨습니다.");
                }
                //1번보스 끝
                if(boss_2_x==b&&boss_2_y==a&&count_1==1&&count_2==0)
                {
                	if(level==0) {
                		Baseball_highlevel(boss_2_1,boss_2_2,boss_2_3,boss_2_4);
                	   	count_2=1;
                	}
                	else {
                	Baseball(boss_2_1,boss_2_2,boss_2_3,level);}
                	count_2=1;
                }
               	else if(boss_2_x==b&&boss_2_y==a&&count_1==0) {
                		System.out.print("1번보스를 잡고 오세요");
                	}
               	else if(boss_2_x==b&&boss_2_y==a&&count_1==1&&count_2==1) {
                		System.out.print("이미 2번보스는 클리어 하셨습니다");
                	}
                	//2번보스 끝
                if(boss_3_x==b&&boss_3_y==a&&count_1==1&&count_2==1&&count_3==0)
                {
                	if(level==0) {
                		Baseball_highlevel(boss_3_1,boss_3_2,boss_3_3,boss_3_4);
                		count_3=1;
                	}
                	else {
                	Baseball(boss_3_1,boss_3_2,boss_3_3,level);}
                	count_3=1;
                }
                else if(boss_3_x==b&&boss_3_y==a&&count_1==0) {
                		System.out.print("1번보스를 잡고 오세요");
                	}
               	else if(boss_3_x==b&&boss_3_y==a&&count_2==00&&count_1==1) {
                		System.out.print("2번보스를 잡고 오세요");
                	}
               	else if(boss_3_x==b&&boss_3_y==a&&count_1==1&&count_2==1&&count_3==1) {
                		System.out.print("이미 3번보스는 클리어 하셨습니다");
                	}
                	//3번보스 끝
                if(boss_4_x==b&&boss_4_y==a&&count_1==1&&count_2==1&&count_3==1&&count_4==0)
                {
                	if(level==0) {
                		Baseball_highlevel(boss_4_1,boss_4_2,boss_4_3,boss_4_4);
                		count_4=1;
                	}
                	else {
                	Baseball(boss_4_1,boss_4_2,boss_4_3,level);}
                	count_4=1;
                }
                else if(boss_4_x==b&&boss_4_y==a&&count_1==0) {
                		System.out.print("1번보스를 잡고 오세요");
                	}
               	else if(boss_4_x==b&&boss_4_y==a&&count_2==0&&count_1==1) {
                		System.out.print("2번보스를 잡고 오세요");
                	}
               	else if(boss_4_x==b&&boss_4_y==a&&count_2==1&&count_1==10&&count_3==0) {
            		System.out.print("3번보스를 잡고 오세요");
            	}
               	else if(boss_4_x==b&&boss_4_y==a&&count_1==1&&count_2==1&&count_4==1&&count_3==1) {
                		System.out.print("모든 보스를 클리어 하셨습니다 T로 나가 주세요");
                	}//4번보스 끝
               	if(Out_x==b&&Out_y==a&&count_1==1&&count_2==1&&count_4==1&&count_3==1)
               	{
               		System.out.print("당신은 승리했습니다. 다시 하시려면 1을 눌러주세요 종료하시려면 0을 눌러주세요");
               		c=scanner.nextInt();
               		
               		setVisible(false);
               		dispose();//gui끄기
               		if(c==1)
               			loginSignal.countDown();//래치를 0으로 돌려 
               		if(c==0)
               			System.exit(0) ;
               	}
               	else if(Out_x==b&&Out_y==a&&count_1==0) {
            		System.out.print("1번보스를 잡고 오세요");
            	}
           	else if(Out_x==b&&Out_y==a&&count_2==0&&count_1==1) {
            		System.out.print("2번보스를 잡고 오세요");
            	}
           	else if(Out_x==b&&Out_y==a&&count_2==1&&count_1==10&&count_3==0) {
        		System.out.print("3번보스를 잡고 오세요");
        	}
           	else if(Out_x==b&&Out_y==a&&count_1==1&&count_2==1&&count_4==0&&count_3==1) {
            		System.out.print("4번보스를 잡고 오세요");
            	}
                break;
            }
        }
    }
    public void Baseball(int x,int y, int z,int e)//3자리수 야구게임
    {
    	Scanner s=new Scanner(System.in);
    	System.out.print("숫자 야구 게임 시작\n");
	int i=1;
	int counter;
	counter=0;
	while(i!=0) {
		counter++;
		if (counter>level) {
			System.out.println("당신은 실패했습니다.") ;
		
		
		}
		System.out.print("시도 횟수"+counter+"/"+level+"\n");
	int user_answer_1=0;
	int user_answer_2=0;
	int user_answer_3=0;
	System.out.print("첫번째 숫자를 입력하세요\n");
	user_answer_1=scanner.nextInt();
	System.out.print("두번째 숫자를 입력하세요\n");
	user_answer_2=scanner.nextInt();
	System.out.print("세번째 숫자를 입력하세요\n");
	user_answer_3=scanner.nextInt();
	if(user_answer_1==x&&user_answer_2==y&&user_answer_3==z)
	{
		System.out.print("3 Strikes\n");
		
		break;
	}
	else { int s1=0;
	int b2=0;
	int b3=0;
	int b4=0;
	int s5=0;
	int b6=0;
	int b7=0;
	int b8=0;
	int s9=0;
		s1=(x==user_answer_1)?1:0;
		b2=(x==user_answer_2)?1:0;
		b3=(x==user_answer_3)?1:0;
		b4=(y==user_answer_1)?1:0;
		s5=(y==user_answer_2)?1:0;
		b6=(y==user_answer_3)?1:0;
		b7=(z==user_answer_1)?1:0;
		b8=(z==user_answer_2)?1:0;
		s9=(z==user_answer_3)?1:0;
		int strike,ball,out=0;
		strike=s1+s5+s9;
		ball=b2+b3+b4+b6+b8+b7;
		if(s1+b4+b7==0)
			out++;
		if(b2+s5+b8==0)
			out++;
		if(b3+b6+s9==0)
			out++;
		
		System.out.print("Strike= "+strike+"  ball= "+ball+"  out= "+out+"\n");
		continue;}}
	}
    public void Baseball_highlevel(int x,int y,int z,int t)//4자리수 야구게임
    {
    	Scanner s=new Scanner(System.in);
    	System.out.print("숫자 야구 게임 시작\n");
    	int i=1;
    	int counter;
		counter=0;
    	while(i!=0) {
    		counter++;
    		if (counter>High_level) {
    			System.out.println("당신은 실패했습니다.") ;
    			
    		}
    		System.out.print("시도 횟수"+counter+"/"+High_level+"\n");
    	int user_answer_1=0;
    	int user_answer_2=0;
    	int user_answer_3=0;
    	int user_answer_4=0;
    	System.out.print("첫번째 숫자를 입력하세요\n");
    	user_answer_1=scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요\n");
		user_answer_2=scanner.nextInt();
		System.out.print("세번째 숫자를 입력하세요\n");
		user_answer_3=scanner.nextInt();
		System.out.print("네번째 숫자를 입력하세요\n");
		user_answer_4=scanner.nextInt();
    	if(user_answer_1==x&&user_answer_2==y&&user_answer_3==z&&user_answer_4==t)
    	{
    		System.out.print("4 Strikes\n");
    		
    		break;
    	}
    	else { int s1=0;
    	
    		s1=(x==user_answer_1)?1:0;
    		int b2 = (x==user_answer_2)?1:0;//b에 1이들어보면 ball  s에 1이 들어오면 strike
    		int b3 = (x==user_answer_3)?1:0;
    		int b4 = (x==user_answer_4)?1:0;
    		int b5 = (y==user_answer_1)?1:0;
    		int s6 = (y==user_answer_2)?1:0;
    		int b7 = (y==user_answer_3)?1:0;
    		int b8 = (y==user_answer_4)?1:0;
    		int b9 = (z==user_answer_1)?1:0;
    		int b10 = (z==user_answer_2)?1:0;
    		int s11 = (z==user_answer_3)?1:0;
    		int b12 = (z==user_answer_4)?1:0;
    		int b13 = (t==user_answer_1)?1:0;
    		int b14 = (t==user_answer_2)?1:0;
    		int b15 = (t==user_answer_3)?1:0;
    		int s16 = (t==user_answer_4)?1:0;
    		int strike,ball,out=0;
    		strike=s1+s6+s11+s16;
    		ball=b2+b3+b4+b5+b7+b8+b9+b10+b12+b13+b14+b15;
    		if(s1+b5+b9+b13==0)
    			out++;//볼도 스트라잌도 아닐시 out++;
    		if(b2+s6+b10+b14==0)
    			out++;
    		if(b3+b7+s11+b15==0)
    			out++;
    		if(b4+b8+b12+s16==0)
    			out++;
    		
    		System.out.print("Strike= "+strike+"  ball= "+ball+"  out= "+out+"\n");
    		continue;
    	}}
    }
    static CountDownLatch loginSignal;
    public static void main(String[] args) {
        
    	Scanner s=new Scanner(System.in);
    	int restart=0;
    	int counter_main=0;
    	while(restart==0) {
    		loginSignal = new CountDownLatch(1);
    		 count_1=0;// 중복되는 벽이 있을때 동서남북 방향표시 중복 방지를 위해
             count_2=0;
             count_3=0;
             count_4=0;
    	System.out.print("난이도를 선택해 주세요 \n 1.easy\n 2.normal\n 3.hard\n");
    	int a;
    	a=s.nextInt();
    	c=0;
    	if (a==1)
        	level=15;//기회+5
    	if (a==2)
            level=11;//기회+1
    	if (a==3)
            level=0;//4자리수야구게임
    	
    	RP2_2013271099 r = new RP2_2013271099();
    	
    	try {
			loginSignal.await();// 래치가 0이 될때까지 기다림
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    	}
        
    }
}

 