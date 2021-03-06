package skinny.controller

import org.scalatra.util.conversion.{ Conversions, TypeConverter }

/**
 * Skinny resource is a DRY module to implement ROA(Resource-oriented architecture) apps.
 * SkinnyResource is surely inspired by Rails ActiveSupport.
 */
trait SkinnyResource extends SkinnyResourceWithId[Long] {

  implicit override val scalatraParamsIdTypeConverter: TypeConverter[String, Long] = Conversions.stringToLong
}

trait SkinnyResourceWithId[Id]
  extends SkinnyController
  with SkinnyResourceActions[Id]
  with SkinnyResourceRoutes[Id]
