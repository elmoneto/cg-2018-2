public class Vet3
{
    private float x;
    private float y;
    private float z;
    
    public Vet3()
    {
        x = y = z = 0;
    }
    
    public Vet3(float x, float y, float z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public float getX()
    {
        return x;
    }
    
    public float getY()
    {
        return y;
    }
    
    public float getZ()
    {
        return z;
    }
    
    @Override
    public String toString()
    {
        return("<" + x + "," + y + "," + z + ">");
    }
    
    public float calcTamanho()
    {
       return (float)Math.sqrt(x*x + y*y + z*z);
    }
    
    public void normalizaVetor()
    {
        float tamanho = calcTamanho();
        x /= tamanho;
        y /= tamanho;
        z /= tamanho;
    }
    
    public void somaVetor(Vet3 v)
    {
        this.x += v.x;
        this.y += v.y;
        this.z += v.z;
    }
    
    public void subtVetor(Vet3 v)
    {
        this.x -= v.x;
        this.y -= v.y;
        this.z -= v.z;
    }
    
    public void multEscalar(float a)
    {
        x *= a;
        y *= a;
        z *= a;
    }
    
    public void divEscalar(float a)
    {
        x /= a;
        y /= a;
        z /= a;
    }
    
    public float calcProdEscalar(Vet3 v)
    {
        return (this.x * v.x + this.y * v.y + this.z * v.z);
    }
    
    public Vet3 getCopia()
    {
        return new Vet3(x,y,z);
    }
    
    public float[] retornaVetor()
    {
        float[] vetRetorno = new float[3];
        vetRetorno[0] = x;
        vetRetorno[1] = y;
        vetRetorno[2] = z;
        return vetRetorno;    
    }  
}
