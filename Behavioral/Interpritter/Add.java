public class Add implements Expression{


    private Expression leftExpression, rightExpression;
    
    public Add(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interprit() {
       return leftExpression.interprit() + rightExpression.interprit();
    }
    

}
