public class Vet2
{
    private float x;
    private float y;
    
    public Vet2()
    {
        x = y = 0;
    }
    
    public Vet2(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    
    public float getX()
    {
        return x;
    }
    
    public float getY()
    {
        return y;
    }
    
    @Override
    public String toString()
    {
        return("<" + x + "," + y + ">");
    }
    
    public float calcTamanho()
    {
       return (float)Math.sqrt(x*x + y*y);
    }
    
    public void normalizaVetor()
    {
        float tamanho = calcTamanho();
        x /= tamanho;
        y /= tamanho;
    }
    
    public void somaVetor(Vet2 v)
    {
        this.x += v.x;
        this.y += v.y;
    }
    
    public void subtVetor(Vet2 v)
    {
        this.x -= v.x;
        this.y -= v.y;
    }
    
    public void multEscalar(float a)
    {
        x *= a;
        y *= a;
    }
    
    public void divEscalar(float a)
    {
        x /= a;
        y /= a;
    }
    
    public float calcProdEscalar(Vet2 v)
    {
        return (this.x * v.x + this.y * v.y);
    }
    
    public Vet2 getCopia()
    {
        return new Vet2(x,y);
    }
    
    public float[] retornaVetor()
    {
        float[] vetRetorno = new float[2];
        vetRetorno[0] = x;
        vetRetorno[1] = y;
        return vetRetorno;    
    }  
}
