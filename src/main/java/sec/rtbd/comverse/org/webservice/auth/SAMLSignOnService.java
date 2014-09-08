

/**
 * SAMLSignOnService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package sec.rtbd.comverse.org.webservice.auth;



    public interface SAMLSignOnService {
          

        /**
          * Auto generated method signature
          * 
                    * @param listGroups
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.ListGroupsResponseE listGroups(

                        sec.rtbd.comverse.org.webservice.auth.ListGroupsE listGroups)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param processLogin
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.ProcessLoginResponseE processLogin(

                        sec.rtbd.comverse.org.webservice.auth.ProcessLoginE processLogin)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param addUserAttributes
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.AddUserAttributesResponseE addUserAttributes(

                        sec.rtbd.comverse.org.webservice.auth.AddUserAttributesE addUserAttributes)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param disableUser
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.DisableUserResponseE disableUser(

                        sec.rtbd.comverse.org.webservice.auth.DisableUserE disableUser)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getSession
                
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.GetSessionResponseE getSession(

                        sec.rtbd.comverse.org.webservice.auth.GetSessionE getSession)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param addRole
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.AddRoleResponseE addRole(

                        sec.rtbd.comverse.org.webservice.auth.AddRoleE addRole)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param listRealms
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.ListRealmsResponseE listRealms(

                        sec.rtbd.comverse.org.webservice.auth.ListRealmsE listRealms)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param listUsers
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.ListUsersResponseE listUsers(

                        sec.rtbd.comverse.org.webservice.auth.ListUsersE listUsers)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param addRealm
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.AddRealmResponseE addRealm(

                        sec.rtbd.comverse.org.webservice.auth.AddRealmE addRealm)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param removeGroup
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.RemoveGroupResponseE removeGroup(

                        sec.rtbd.comverse.org.webservice.auth.RemoveGroupE removeGroup)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param enableUser
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.EnableUserResponseE enableUser(

                        sec.rtbd.comverse.org.webservice.auth.EnableUserE enableUser)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getGroup
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.GetGroupResponseE getGroup(

                        sec.rtbd.comverse.org.webservice.auth.GetGroupE getGroup)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getRole
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.GetRoleResponseE getRole(

                        sec.rtbd.comverse.org.webservice.auth.GetRoleE getRole)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param removeRealm
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.RemoveRealmResponseE removeRealm(

                        sec.rtbd.comverse.org.webservice.auth.RemoveRealmE removeRealm)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param unlockUser
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.UnlockUserResponseE unlockUser(

                        sec.rtbd.comverse.org.webservice.auth.UnlockUserE unlockUser)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param updateUser
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.UpdateUserResponseE updateUser(

                        sec.rtbd.comverse.org.webservice.auth.UpdateUserE updateUser)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param isProductionSite
                
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.IsProductionSiteResponseE isProductionSite(

                        sec.rtbd.comverse.org.webservice.auth.IsProductionSiteE isProductionSite)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param removeUserAttributes
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesResponseE removeUserAttributes(

                        sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesE removeUserAttributes)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param changePassword
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.ChangePasswordResponseE changePassword(

                        sec.rtbd.comverse.org.webservice.auth.ChangePasswordE changePassword)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param listRoles
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.ListRolesResponseE listRoles(

                        sec.rtbd.comverse.org.webservice.auth.ListRolesE listRoles)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param removeRole
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.RemoveRoleResponseE removeRole(

                        sec.rtbd.comverse.org.webservice.auth.RemoveRoleE removeRole)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param lockUser
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.LockUserResponseE lockUser(

                        sec.rtbd.comverse.org.webservice.auth.LockUserE lockUser)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param addGroup
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.AddGroupResponseE addGroup(

                        sec.rtbd.comverse.org.webservice.auth.AddGroupE addGroup)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param proxyLogin
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.ProxyLoginResponseE proxyLogin(

                        sec.rtbd.comverse.org.webservice.auth.ProxyLoginE proxyLogin)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param changeUserAttributes
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesResponseE changeUserAttributes(

                        sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesE changeUserAttributes)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param removeUser
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.RemoveUserResponseE removeUser(

                        sec.rtbd.comverse.org.webservice.auth.RemoveUserE removeUser)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param updateRealm
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.UpdateRealmResponseE updateRealm(

                        sec.rtbd.comverse.org.webservice.auth.UpdateRealmE updateRealm)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param processLogout
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.ProcessLogoutResponseE processLogout(

                        sec.rtbd.comverse.org.webservice.auth.ProcessLogoutE processLogout)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param updateGroup
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.UpdateGroupResponseE updateGroup(

                        sec.rtbd.comverse.org.webservice.auth.UpdateGroupE updateGroup)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getRealm
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.GetRealmResponseE getRealm(

                        sec.rtbd.comverse.org.webservice.auth.GetRealmE getRealm)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param resetPassword
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.ResetPasswordResponseE resetPassword(

                        sec.rtbd.comverse.org.webservice.auth.ResetPasswordE resetPassword)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param updateRole
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.UpdateRoleResponseE updateRole(

                        sec.rtbd.comverse.org.webservice.auth.UpdateRoleE updateRole)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param addUser
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.AddUserResponseE addUser(

                        sec.rtbd.comverse.org.webservice.auth.AddUserE addUser)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getUser
                
             * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
         */

         
                     public sec.rtbd.comverse.org.webservice.auth.GetUserResponseE getUser(

                        sec.rtbd.comverse.org.webservice.auth.GetUserE getUser)
                        throws java.rmi.RemoteException
             
          ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException;

        

        
       //
       }
    