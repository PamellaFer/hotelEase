//package com.projetoDeDesenvolvimento.hotelEase.service
//
//import com.projetoDeDesenvolvimento.hotelEase.enum.AdministratorRoleEnum
//import com.projetoDeDesenvolvimento.hotelEase.enum.UserRoleEnum
//import com.projetoDeDesenvolvimento.hotelEase.models.entity.Users
//
//class ServiceToDifferentiateUsers (val userRole: UserRoleEnum, val users: Users) {
//    fun differentiateUser(): AdministratorRoleEnum {
//        return when (userRole) {
//            UserRoleEnum.ADMINISTRATOR -> administratorRole
//            else -> null
//        }
//    }
//}
//
//    // como estava na classe User:
////    {
////        fun differentiateUserFromAdministrator (userRole: UserRoleEnum): AdministratorRoleEnum? {
////            return when (userRole) {
////                UserRoleEnum.ADMINISTRATOR -> administratorRole
////                else -> null
////            }
////        }
////    }
//
//
