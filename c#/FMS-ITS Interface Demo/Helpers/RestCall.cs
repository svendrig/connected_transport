using FMS_ITS_Interface_Demo.Models;
using System.Net;

namespace FMS_ITS_Interface_Demo
{
    class RestCall
    {
        public static WebRequest getRequest(ItsAccount itsAccount, byte[] data, string endPoint)
        {
            string url = string.Concat(itsAccount.apiUrl, endPoint);
            WebRequest myReq = WebRequest.Create(url);

            myReq.Headers[itsAccount.apiSecretName] = itsAccount.apiSecret;
            myReq.Method = "Put";
            myReq.ContentType = itsAccount.apiMediaType;
            myReq.ContentLength = data.Length;

            return myReq;
        }
    }
}
