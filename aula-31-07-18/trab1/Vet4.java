public class Vet4
{
    private float x;
    private float y;
    private float z;
    private float w;
    
    public Vet4()
    {
        x = y = z = w = 0;
    }
    
    public Vet4(float x, float y, float z, float w)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
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
    
    public float getW()
    {
        return w;
    }
    
    @Override
    public String toString()
    {
        return("<" + x + "," + y + "," + z + "," + w + ">");
    }
    
    public float calcTamanho()
    {
       return (float)Math.sqrt(x*x + y*y + z*z + w*w);
    }
    
    public void normalizaVetor()
    {
        float tamanho = calcTamanho();
        x /= tamanho;
        y /= tamanho;
        z /= tamanho;
        w /= tamanho;
    }
    
    public void somaVetor(Vet4 v)
    {
        this.x += v.x;
        this.y += v.y;
        this.z += v.z;
        this.w += v.w;
    }
    
    public void subtVetor(Vet4 v)
    {
        this.x -= v.x;
        this.y -= v.y;
        this.z -= v.z;
        this.w -= v.w;
    }
    
    public void multEscalar(float a)
    {
        x *= a;
        y *= a;
        z *= a;
        w *= a;
    }
    
    public void divEscalar(float a)
    {
        x /= a;
        y /= a;
        z /= a;
        w /= a;
    }
    
    public float calcProdEscalar(Vet4 v)
    {
        return (this.x * v.x + this.y * v.y +
                this.z * v.z + this.w * v.w);
    }
    
    public Vet4 getCopia()
    {
        return new Vet4(x,y,z,w);
    }
    
    public float[] retornaVetor()
    {
        float[] vetRetorno = new float[4];
        vetRetorno[0] = x;
        vetRetorno[1] = y;
        vetRetorno[2] = z;
        vetRetorno[3] = w;
        return vetRetorno;    
    }  
}
