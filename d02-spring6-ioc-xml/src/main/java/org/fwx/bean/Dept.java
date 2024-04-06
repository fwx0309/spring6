package org.fwx.bean;

/**
 * @ClassName Dept
 * @Description TODO
 * @Author Fwx
 * @Date 2024/4/5 18:27
 * @Version 1.0
 */
public class Dept {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void info(){
        System.out.println( this.deptName + "...");
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptName='" + deptName + '\'' +
                '}';
    }
}
