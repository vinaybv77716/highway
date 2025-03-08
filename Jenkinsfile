pipeline
{
        agent any
        stages
    {
        stage('cleane')
        {
            steps
            {
sh 'pwd'
sh 'ls'
            sh 'rm -r *'
            sh 'rm -r ../../../../www/html/*'
            }
        }


        stage('git clone')
        {
            steps
            {
                sh 'git clone https://gitlab.com/vinaybv77716/highway.git -b master'
            }
        }

        stage('git move')
        {
            steps
            {
                sh 'mv highway/* ../../../../www/html'

            }
        }



    }
}
