package 设计模式.命令模式;

//没有任何命令，空执行，用于初始化每个按钮
//当调用空命令时，对象什么都不做即可
//这也是一种设计模式，可以省掉对空判断
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
